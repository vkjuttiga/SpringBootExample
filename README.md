
# Spring Boot Helm Prometheus

prometheus metric generation



Add this repo to your helm
```bash
helm repo add prometheus-community https://prometheus-community.github.io/helm-charts
```

Install prometheus from prometheus-community
```bash
  helm install my-release prometheus-community/kube-prometheus-stack --namespace monitoring --create-namespace

```

Port Forward prometheus UI
```bash
export POD_NAME=$(kubectl get pods --namespace monitoring -l "app=prometheus" -o jsonpath="{.items[0].metadata.name}");kubectl --namespace monitoring port-forward $POD_NAME 9090;
```

Port Forward grafana UI
```bash
export POD_NAME=$(kubectl get pods --namespace monitoring -l "app.kubernetes.io/name=grafana" -o jsonpath="{.items[0].metadata.name}");kubectl --namespace monitoring port-forward $POD_NAME 9091:80;
```


Alternative port fwd
```bash
kubectl edit svc my-release-grafana  -n monitoring
```
and then change the ClusterIP to NodePort



Change Grafana Password
```bash
kubectl exec --namespace monitoring -c grafana -it $(kubectl get pods --namespace monitoring -l "app.kubernetes.io/name=grafana" -o jsonpath="{.items[0].metadata.name}") -- grafana-cli admin reset-admin-password Abcd1234
```


#Now deploy spring boot app 

Package the spring boot app
```bash
  mvn package
```


Docker Build
```bash
  docker build . -t spring-test:v4
```


Helm Install
```bash
  helm package spring-boot-helm
  helm install spring-boot-helm spring-boot-helm-0.1.0.tgz --namespace com-att-idp --create-namespace
```

open the endpoint http://localhost:32083/students

Helm Delete
```bash
 helm delete spring-boot-helm -n com-att-idp
```









kubectl --namespace monitoring port-forward prometheus-kube-state-metrics-58c5cd6ddb-cct8p  8080



kubectl --namespace monitoring port-forward alertmanager-prometheus-kube-prometheus-alertmanager-0 9093
sudo kubectl --namespace monitoring port-forward prometheus-grafana-588475b7c6-4txf6 80
kubectl --namespace monitoring port-forward prometheus-kube-prometheus-operator-bcdfdbc79-c47bl 443
kubectl --namespace monitoring port-forward prometheus-kube-state-metrics-58c5cd6ddb-cct8p 8080
kubectl --namespace monitoring port-forward prometheus-prometheus-kube-prometheus-prometheus-0 9090
kubectl --namespace monitoring port-forward prometheus-prometheus-node-exporter-sndfb 9100

kubectl get svc -n monitoring

Docker system prune
```bash
  docker system prune -a
```

Check if prometheus is deployed
```bash
  kubectl get svc -n monitoring
  kubectl edit svc my-release-kube-prometheus-prometheus -n monitoring
  kubectl edit svc my-release-grafana  -n monitoring
 
```

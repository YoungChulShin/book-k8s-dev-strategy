# 시크릿 생성
생성 1) 명령어를 이용한 생성
```
kubectl create secret generic <<secret name>> --from-literal=<<key>>='<<value>>' --from-literal=<<key2>>='<<value2>>'
```

생성 2) yaml을 이용한 생성
```yaml
apiVersion: v1
kind: Secret
metadata:
    name: my-secret
data:
    <<key>>: <<value>>
```
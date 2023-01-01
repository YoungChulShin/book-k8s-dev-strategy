# helm 명령어
헬름 생성
```
helm create {{app name}}
```

헬름 패키징
```
helm package {{app name}}
```
- `{{app name}}-{{chart version}}.tgz` 파일이 생성된다

헬름 패키지 설치전 정보 확인
```
helm install <<install name> <<package file> --dry-run
```

헬름 패키지 설치
```
helm install <<install name> <<package file>
```

헬름 패키지 업데이트
```
helm upgrade <<install name>> <<package file>>
```

헬름 이력 확인
```
helm history <<install name>>

>> 실행 결과
REVISION        UPDATED                         STATUS          CHART           APP VERSION     DESCRIPTION     
1               Sun Jan  1 16:48:19 2023        superseded      my-app-1.0.0    1.1.0           Install complete
2               Sun Jan  1 16:51:36 2023        deployed        my-app-1.0.1    1.0.0           Upgrade complete
```
헬름 롤백
```
helm rollback <<install name>>  <<revision>>
```



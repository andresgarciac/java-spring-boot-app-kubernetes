# This is a basic Java Application made with Gradle and Spring boot just for learning purposes about Docker and Kubernetes.

Jib: is a plugin to create docker images the next command creates the Docker Image into the selected registry.
```sh
sudo ./gradlew jibDockerBuild
```
     
# The application is deployed into an EKS cluster using helm to deploy the pods.

Helm’s server-side component, Tiller, requires special permission on the kubernetes cluster. We need to build a Service Account for tiller to use and enable permissions for it. Then we can install Helm in EKS:
```sh
kubectl -n kube-system create sa tiller
kubectl create clusterrolebinding tiller --clusterrole cluster-admin --serviceaccount=kube-system:tiller
helm init --service-account tiller
```
# Deploy Spring Boot Application to Cloud Foundry Platform

Now a days Cloud Computing and Microservice have become very popular concept and almost all the organizations are investing and adapting it very fast. Currently there are only few popular cloud providers in the market and Cloud Foundry is one of them. It is a PaaS service where we can easily deploy and manage our applications and the Cloud Foundry will take care of the rest of the cloud based offerings like scalability, high availability etc.

Today we will learn to deploy spring boot application in cloud foundry starting from setting up cloud foundry in local workstation. We will mainly focus on the Pivotal Cloud Foundry platform called as Pivotal Web Services.

## What is Cloud Foundry
Cloud Foundry is an open-source platform as a service (PaaS) that provides you with a choice of clouds, developer frameworks, and application services. It is open source and it is governed by the Cloud Foundry Foundation. The original Cloud Foundry was developed by VMware and currently it is managed by Pivotal, a joint venture company by GE, EMC and VMware.

Now since Cloud Foundry is open source product many popular organizations currently provides this platform separately and below are the list of current certified providers.

* Pivotal Cloud Foundry
* IBM Bluemix
* HPE Helion Stackato 4.0
* Atos Canopy
* CenturyLink App Fog
* GE Predix
* Huawei FusionStage
* SAP Cloud Platform
* Swisscom Application Cloud

## Installation & login into web console
The cloud foundry works very well from command prompt and cloud foundry has provided one command line tool called <b>cf</b> which does almost all the activities for us. So to make this tool (cf command) available in local workstation, first we need to install and configure the Cloud Foundry Command line (CLI) interface.

Download the [CF Windows installer](https://cli.run.pivotal.io/stable?release=windows64&source=github) and install it.

Verify the installation by opening a terminal window and type cf. If your installation was successful, the cf CLI help listing appears. This indicates that you are ready to go with any cloud foundry platform from your local workstation.

We will now proceed with Pivotal Web service account sign up and development of a sample application and push to cloud foundry.

Once sign up is completed, we can log into the console through the log in screen of the pivotal web service console.

After successfully logged in, we will get into the cloud foundry console where we can see all the deployed applications, can monitor the applications and do many more activities. Here we need to add org and space etc. which is very straight forward and self-describing.

## Login and logout from PWS Console using CLI
* Login to PWS – We will use command

```
cf login -a api.run.pivotal.io 
```
After giving command, it will ask for registered email and password and once provided successfully, it will logon to the platform.
Logout from PWS Console – We will use command 

```
cf logout
```
To logout from the platform, once we have all the work done for that session.

## Build & Deploy app in PCF
We will create one Spring boot application and will deploy to PWS console and access from Cloud Foundry itself.

As we have Cloud Foundry CLI already configured, we will use CLI cf push command to deploy the application in cloud foundry console.

To do that open command prompt and go to maven application’s home directory and use cf login -a api.run.pivotal.io command to login to pivotal web service console.

It will ask for the registered credentials and finally log on to the console.

Now we need to push the application with the command cf push.

```
cf push sb-thymeleaf-startup -p target\sb-thymeleaf-startup-0.0.1-SNAPSHOT.jar
```
This will deploy the application to the already logged in PWS console from the previous step.

## Verify Application Deployment
Verify into PWS web console to check that the newly deployed application is showing up.

Now if we click on the Apps section PWS web console. It will show the url where application has been deployed. In this case it will be somethig like (https://sb-thymeleaf-startup.cfapps.io/). This URL will change based on the application name we choose.

Now let's browse and access the application with the url host published in the cf console. 


# Micro-services-Spring-boot-app
Project Idea – It is a second-hand iPhone shop. Customers can buy mobile phone through the web
application.
It has four microservices.
1. Product service
We can add second hand iPhone through this service layer. And we can see all added.
2. Order service
Customer can order their preferred iPhone. And customers can view all their orders.
3. iPhone inventory service
It stores all types of second-hand iPhones. When a customer order a iPhone order service
check the available phones through inventory service. then according to availability, they can
order their phones.
4. Discovery server
It allows clients applications to find services through a router or a load balancer.

#Hosting Platform : Amazon Web Services
I have created two EC2 instances, S3 and RDS. EC2 instances are names Server-1 and Server-2. 
RDS names as second hand iPhone shop. I did Elastic Load Balancing that automatically 
distributes incoming traffic across multiple targets, such as EC2 instances, containers, and 
IP addresses, in one or more Availability Zones. It decreases the network traffic.
I added create Order services and discovery services in the EC2 instance of server-1. 
and also Order service and Phone inventory service in the EC2 Instance of Server-2.
![image](https://user-images.githubusercontent.com/54390792/206096176-ff2452a8-7d7d-472d-abed-17f1d6f6d4e7.png)
![image](https://user-images.githubusercontent.com/54390792/206096212-b2985ca0-c763-4ef8-96d7-28cfeb6ce3f4.png)
![image](https://user-images.githubusercontent.com/54390792/206096243-f88e1eb2-93ff-4228-948b-6bcdda39a616.png)
![image](https://user-images.githubusercontent.com/54390792/206096272-93d01748-76c2-4e3d-be1b-c0439dd2245d.png)




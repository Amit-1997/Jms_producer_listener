﻿# Jms_producer_listener
Jms using SpringBoot and RabbitMQ

Docker Command to install docker and running on port number 15672

docker run -d --hostname my-rabbit --name some-rabbit -p 8080:15672 rabbitmq:3-management

1-> if container will created then you can find your Rabbit MQ will be running on " http://localhost:15672/#/ "
2-> UserName- "guest" and password is "guest"

3-> Then we will create two spring boot Application one for producing the messages and one is for listening the messages.
------------------------------------------------------------------------------------------------------------------------
you will fine the producer code in producer Branch and consumer code in Main branch

-> download both the package in your local run the application you will get some ideas on microservices, Rest api, java spring boot etc.

Test case--------------------------------------------------------------------------------------------------------------

This project is made, keeping a case study into consideration like Ram is a truck owner and as a owner of the vehicle he want to get status of his vehicle sitting at his home so, there are n numbers of sensors fitted into his truck but lets narrow it down and consider only sensors are there in tyre so with the help of this application Ram can able to know the air in tyre, condition of tyre and this help ram to save his truck from severe accident, low Maintainance cost, save lots of money.

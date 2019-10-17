# springboot_rabbit
Spring整合rabbitMQ
1、修改 pom.xml，添加依赖spring-boot-starter-amqp
2、在resources中建application.properties配置host、username、password、port
3、新建RabbitConfig用来配置 RabbitMQ，创建队列，创建 Exchange  绑定队列到交换机
4、新建Provider用于生产消息用到AmqpTemplate
5、新建Consumer用于消费消息 @RabbitListener
6、新建 SpringBoot 启动类App
7、单元测试junit.Before  @RunWith @SpringBootTest

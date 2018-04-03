## 剧本和演员的解耦
**项目对象：**  
`GeLi` 角色(接口)  
`ActorArangable` 安排演员(接口)  
`MoAttack` 剧本(类)  
`LiuDeHua` 人(类)  
`Director` 导演(类)
> 导演Director将Actor对象（刘德华LiuDeHua）安排在GeLi的角色上，也可以安排其他演员扮演GeLi角色，于是导演将剧本、角色、饰演者装配起来。    

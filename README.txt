项目名：约咖服务器
作者：王宇杰
创建时间：2018年11月
编码格式：UTF-8
数据库：MYSQL
项目文件结构：
Yue{

	JRE System Library(){
		JRE系统库;
	}
	
	Java EE 6 Libraries(){
		自带的;
	}
	
	src(放置Java文件){
		com(域名){
			wyj(作者名){
				operate(操作类){
					imp(实现类){
						UserOptImp.java(用户操作实现类){
						
						}
					}
					UserOpt.java(用户操作接口){
					
					}
				}
				po(实体类){
					user(用户信息){
						UAInf.java(所有信息){
						
						}
						UFInf.java(基础信息){
						
						}
						UBInf.java(简要信息){
						
						}
					}
					list(列表信息){
						Charm.java(魅力榜){
							
						}
						Chat.java(聊天列表){
						
						}
						Comment.java(评论列表){
						
						}
						Friend.java(好友列表){
						
						}
						Room.java(房间列表){
						
						}
						Trends.java(动态列表){
						
						}
					}
				}
				service(){
				
				}
				tools(工具类){
					DB.java(获取/关闭数据库连接){
					
					}
				}
			}
		}
		conf.properties{
			存放一些常量;
		}
		db.properties{
			存放与数据库连接时所需要的数据;
		}
	}
	
	WebRoot(前台相关){
		
	}
	
	README.txt{
		阅读文档;
	}
	
	数据库名+日期.sql{
		数据库备份;
	}
	
}

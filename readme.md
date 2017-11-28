# bojiu swagger-api 

## 使用方法 - web 端
1. 进入到web项目的根目录，执行
git submodule add git@gitsvr.0lz.net:yijie.l/bojiu-swagger-api.git swagger-api
2. 执行git submodule init
3. 执行git submodule update --remote
4. 使用swagger-client 解析 swagger-api/jsclient/swagger.json

每次api有更新，重复步骤2-3.


## 使用方法 - server 端

1. 修改main.yaml
2. 执行 generateSpring.bat 生成服务端接口
3. 其余脚本尚未完成
### 安装npm和npm
sudo apt-get install npm
sudo npm install -g cnpm --registry=https://registry.npm.taobao.org
sudo ln -s /usr/bin/nodejs /usr/bin/node
sudo npm -g n
sudo n stable
sudo cnpm install -g typescript
## client 端使用方法

1. clone 本工程
2. 找到对应的代码目录



## API文档查看方法

1. 打开[swagger editor](http://editor.swagger.io/)
2. 拷贝 main.yaml 文件到editor左侧文本框
3. 右侧即为接口文档

注意：如果使用的是 https协议打开编辑器，那么 try it out 接口将无法使用

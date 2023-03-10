<template>
<div :style='{"width":"1200px","padding":"20px","boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","margin":"10px auto","position":"relative"}'>
    <el-form
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
    >
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"#fff"}' label="宠物编号" prop="chongwubianhao">
              <el-input v-model="ruleForm.chongwubianhao" placeholder="宠物编号" readonly></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"#fff"}' label="宠物名称" prop="chongwumingcheng">
            <el-input v-model="ruleForm.chongwumingcheng" 
                placeholder="宠物名称" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"#fff"}'  label="宠物类型" prop="chongwuleixing">
            <el-select v-model="ruleForm.chongwuleixing" placeholder="请选择宠物类型" >
              <el-option
                  v-for="(item,index) in chongwuleixingOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"#fff"}' label="图片" v-if="type!='cross' || (type=='cross' && !ro.tupian)" prop="tupian">
            <file-upload
            tip="点击上传图片"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.tupian?ruleForm.tupian:''"
            @change="tupianUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"#fff"}' class="upload" v-else label="图片" prop="tupian">
                <img v-if="ruleForm.tupian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.tupian.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.tupian.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"#fff"}'  label="性别" prop="xingbie">
            <el-select v-model="ruleForm.xingbie" placeholder="请选择性别" >
              <el-option
                  v-for="(item,index) in xingbieOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"#fff"}' label="宠物特征" prop="chongwutezheng">
            <el-input v-model="ruleForm.chongwutezheng" 
                placeholder="宠物特征" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"#fff"}' label="健康状况" prop="jiankangzhuangkuang">
            <el-input v-model="ruleForm.jiankangzhuangkuang" 
                placeholder="健康状况" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"#fff"}'  label="领养状况" prop="lingyangzhuangkuang">
            <el-select v-model="ruleForm.lingyangzhuangkuang" placeholder="请选择领养状况" >
              <el-option
                  v-for="(item,index) in lingyangzhuangkuangOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"#fff"}' label="宠物简介" prop="chongwujianjie">
            <editor 
                :style='{"padding":"0","boxShadow":"0 0 0px rgba(75,223,201,.5)","margin":"0","backgroundColor":"#fff","borderRadius":"0","borderWidth":"1px","borderImage":"linear-gradient(90deg, rgba(50.000000819563866, 38.0000015348196, 187.00000405311584, 1), rgba(148.7414985895157, 148.7414985895157, 148.7414985895157, 1)) 1 1","width":"100%","borderStyle":"solid","height":"auto"}'
                v-model="ruleForm.chongwujianjie" 
                class="editor" 
                action="file/upload">
            </editor>
          </el-form-item>

      <el-form-item :style='{"padding":"0","margin":"0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0 40px","margin":"0 20px 0 0","outline":"none","color":"#fff","borderRadius":"28px","background":"#FDB930","width":"auto","lineHeight":"40px","fontSize":"14px","height":"40px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"0px solid rgba(64, 158, 255, 1)","cursor":"pointer","padding":"0 40px","margin":"0","outline":"none","color":"#565656","borderRadius":"28px","background":"#BEBEBE","width":"auto","lineHeight":"40px","fontSize":"14px","height":"40px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
      return {
        id: '',
        baseUrl: '',
        ro:{
            chongwubianhao : false,
            chongwumingcheng : false,
            chongwuleixing : false,
            tupian : false,
            xingbie : false,
            chongwutezheng : false,
            jiankangzhuangkuang : false,
            lingyangzhuangkuang : false,
            chongwujianjie : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          chongwubianhao: this.getUUID(),
          chongwumingcheng: '',
          chongwuleixing: '',
          tupian: '',
          xingbie: '',
          chongwutezheng: '',
          jiankangzhuangkuang: '',
          lingyangzhuangkuang: '',
          chongwujianjie: '',
        },
        chongwuleixingOptions: [],
        xingbieOptions: [],
        lingyangzhuangkuangOptions: [],
        rules: {
          chongwubianhao: [
          ],
          chongwumingcheng: [
          ],
          chongwuleixing: [
          ],
          tupian: [
          ],
          xingbie: [
          ],
          chongwutezheng: [
          ],
          jiankangzhuangkuang: [
          ],
          lingyangzhuangkuang: [
          ],
          chongwujianjie: [
          ],
        },
      };
    },
    computed: {



    },
    created() {
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.baseUrl = this.$config.baseUrl;
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='chongwubianhao'){
              this.ruleForm.chongwubianhao = obj[o];
              this.ro.chongwubianhao = true;
              continue;
            }
            if(o=='chongwumingcheng'){
              this.ruleForm.chongwumingcheng = obj[o];
              this.ro.chongwumingcheng = true;
              continue;
            }
            if(o=='chongwuleixing'){
              this.ruleForm.chongwuleixing = obj[o];
              this.ro.chongwuleixing = true;
              continue;
            }
            if(o=='tupian'){
              this.ruleForm.tupian = obj[o].split(",")[0];
              this.ro.tupian = true;
              continue;
            }
            if(o=='xingbie'){
              this.ruleForm.xingbie = obj[o];
              this.ro.xingbie = true;
              continue;
            }
            if(o=='chongwutezheng'){
              this.ruleForm.chongwutezheng = obj[o];
              this.ro.chongwutezheng = true;
              continue;
            }
            if(o=='jiankangzhuangkuang'){
              this.ruleForm.jiankangzhuangkuang = obj[o];
              this.ro.jiankangzhuangkuang = true;
              continue;
            }
            if(o=='lingyangzhuangkuang'){
              this.ruleForm.lingyangzhuangkuang = obj[o];
              this.ro.lingyangzhuangkuang = true;
              continue;
            }
            if(o=='chongwujianjie'){
              this.ruleForm.chongwujianjie = obj[o];
              this.ro.chongwujianjie = true;
              continue;
            }
          }
        }
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
          }
        });
        this.$http.get('option/chongwuleixing/chongwuleixing', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.chongwuleixingOptions = res.data.data;
          }
        });
        this.xingbieOptions = "公,母".split(',')
        this.lingyangzhuangkuangOptions = "已被申请,已领养,待领养".split(',')
      },

    // 多级联动参数
      // 多级联动参数
      info(id) {
        this.$http.get('chongwuxiu/detail/${id}', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

        //更新跨表属性
        var crossuserid;
        var crossrefid;
        var crossoptnum;
        this.$refs["ruleForm"].validate(valid => {
          if(valid) {
            if(this.type=='cross'){
                 var statusColumnName = localStorage.getItem('statusColumnName');
                 var statusColumnValue = localStorage.getItem('statusColumnValue');
                 if(statusColumnName && statusColumnName!='') {
                     var obj = JSON.parse(localStorage.getItem('crossObj'));
                     if(!statusColumnName.startsWith("[")) {
                         for (var o in obj){
                             if(o==statusColumnName){
                                 obj[o] = statusColumnValue;
                             }
                         }
                         var table = localStorage.getItem('crossTable');
                         this.$http.post(table+'/update', obj).then(res => {});
                     } else {
                            crossuserid=Number(localStorage.getItem('userid'));
                            crossrefid=obj['id'];
                            crossoptnum=localStorage.getItem('statusColumnName');
                            crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                     }
                 }
            }
            if(crossrefid && crossuserid) {
                 this.ruleForm.crossuserid=crossuserid;
                 this.ruleForm.crossrefid=crossrefid;
                 var params = {
                     page: 1,
                     limit: 10,
                     crossuserid:crossuserid,
                     crossrefid:crossrefid,
                 }
                 this.$http.get('chongwuxiu/list', {
                  params: params
                 }).then(res => {
                     if(res.data.data.total>=crossoptnum) {
                         this.$message({
                          message: localStorage.getItem('tips'),
                          type: 'success',
                          duration: 1500,
                         });
                          return false;
                     } else {
                         // 跨表计算


                          this.$http.post('chongwuxiu/add', this.ruleForm).then(res => {
                              if (res.data.code == 0) {
                                  this.$message({
                                      message: '操作成功',
                                      type: 'success',
                                      duration: 1500,
                                      onClose: () => {
                                          this.$router.go(-1);
                                      }
                                  });
                              } else {
                                  this.$message({
                                      message: res.data.msg,
                                      type: 'error',
                                      duration: 1500
                                  });
                              }
                          });
                     }
                 });
             } else {


                  this.$http.post('chongwuxiu/add', this.ruleForm).then(res => {
                     if (res.data.code == 0) {
                          this.$message({
                              message: '操作成功',
                              type: 'success',
                              duration: 1500,
                              onClose: () => {
                                  this.$router.go(-1);
                              }
                          });
                      } else {
                          this.$message({
                              message: res.data.msg,
                              type: 'error',
                              duration: 1500
                          });
                      }
                  });
             }
          }
        });
      },
      // 获取uuid
      getUUID () {
        return new Date().getTime();
      },
      // 返回
      back() {
        this.$router.go(-1);
      },
      tupianUploadChange(fileUrls) {
          this.ruleForm.tupian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #000;
	  font-weight: 500;
	  width: 80px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 80px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  border: 1px solid;
	  border-radius: 0;
	  padding: 0 12px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  color: #000;
	  border-image: linear-gradient(90deg, rgba(50.000000819563866, 38.0000015348196, 187.00000405311584, 1), rgba(148.7414985895157, 148.7414985895157, 148.7414985895157, 1)) 1 1;
	  width: 400px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border: 1px solid ;
	  border-radius: 0;
	  padding: 0 10px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  color: #000;
	  border-image: linear-gradient(90deg, rgba(50.000000819563866, 38.0000015348196, 187.00000405311584, 1), rgba(148.7414985895157, 148.7414985895157, 148.7414985895157, 1)) 1 1;
	  width: 200px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border: 1px solid;
	  border-radius: 0;
	  padding: 0 10px 0 30px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  color: #000;
	  border-image: linear-gradient(90deg, rgba(50.000000819563866, 38.0000015348196, 187.00000405311584, 1), rgba(148.7414985895157, 148.7414985895157, 148.7414985895157, 1)) 1 1;
	  width: 200px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  border: 1px dashed rgba(64, 158, 255, 1);
	  cursor: pointer;
	  border-radius: 6px;
	  color: #3226BB;
	  border-image: linear-gradient(90deg, rgba(50.000000819563866, 38.0000015348196, 187.00000405311584, 1), rgba(148.7414985895157, 148.7414985895157, 148.7414985895157, 1)) 1 1;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  border: 1px dashed rgba(64, 158, 255, 1);
	  cursor: pointer;
	  border-radius: 6px;
	  color: #3226BB;
	  border-image: linear-gradient(90deg, rgba(50.000000819563866, 38.0000015348196, 187.00000405311584, 1), rgba(148.7414985895157, 148.7414985895157, 148.7414985895157, 1)) 1 1;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  border: 1px dashed rgba(64, 158, 255, 1);
	  cursor: pointer;
	  border-radius: 6px;
	  color: #3226BB;
	  border-image: linear-gradient(90deg, rgba(50.000000819563866, 38.0000015348196, 187.00000405311584, 1), rgba(148.7414985895157, 148.7414985895157, 148.7414985895157, 1)) 1 1;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 1px solid ;
	  border-radius: 0;
	  padding: 12px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  color: #000;
	  border-image: linear-gradient(90deg, rgba(50.000000819563866, 38.0000015348196, 187.00000405311584, 1), rgba(148.7414985895157, 148.7414985895157, 148.7414985895157, 1)) 1 1;
	  width: 400px;
	  font-size: 14px;
	  height: 120px;
	}
</style>

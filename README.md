# RecyclerView-Gallery
一个用recyclerView实现的gallery，1分钟快速集成

### 效果图如下
![](Untitled.gif)

### 使用方式1：
Step 1. Add the JitPack repository to your build file
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Step 2. Add the dependency
```  
    dependencies {
	        compile 'com.github.mengpeng920223:RecyclerView-Gallery:v1.0.0'
    }
```

### 使用方式2：
下载jar<herf url="https://gitee.com/mengpeng920223/RecyclerView-Gallery/raw/master/recyclerview_gallery_V1.0.0.jar">放到你的lib文件夹里面


### 快速让你的RecyclerView变成画廊
```

 RecyclerView recyclerView = findViewById(R.id.recyclerView);
 

 //水平方向CarouselLayoutManager.HORIZONTAL  竖直方向CarouselLayoutManager.VERTICAL
 CarouselLayoutManager layoutManager = new CarouselLayoutManager(CarouselLayoutManager.HORIZONTAL);
 layoutManager.setPostLayoutListener(new CarouselZoomPostLayoutListener());
 

 recyclerView.setLayoutManager(layoutManager);
 recyclerView.setHasFixedSize(true);
 recyclerView.addOnScrollListener(new CenterScrollListener());
 
 //你自己的adapter，在adapter无需做任何改动
 recyclerView.setAdapter(adapter);
```

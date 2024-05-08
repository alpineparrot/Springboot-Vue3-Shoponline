<template>
   <div class="card shadow-sm">
     <span class="img" :style="{backgroundImage: `url(${item.imgPath})`}"></span>
      <div class="card-body">
        <p class="card-text">{{ item.name }}</p>
        <div class="d-flex justify-content-between align-items-center">
          <div class="btn-group">
            <button type="button" class="btn btn-sm btn-outline-secondary">Get this</button>
          </div>
          <small class="text-body-secondary">{{ item.price }}euros</small>
        </div>
      </div>
    </div>
</template>
<script>
export default {
  name: "Card",
  props:{
    item: Object
  }
}
</script>

<style scoped>
.card .img{
  display:inline-block;
  width:100%;
  height:250px;
  background-size: cover;
  background-position: center;
}
</style>
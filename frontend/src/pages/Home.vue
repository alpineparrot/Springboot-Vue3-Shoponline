<template>
  <div class="home">
    <section class="py-5 text-center container">
      <div class="row py-lg-5">
        <div class="col-lg-6 col-md-8 mx-auto">
          <h1 class="fw-light">مثال الألبوم</h1>
          <p class="lead text-body-secondary">وصف قصير حول الألبوم أدناه (محتوياته ، ومنشؤه ، وما إلى ذلك). اجعله قصير ولطيف، ولكن ليست قصير جدًا حتى لا يتخطى الناس هذا الألبوم تمامًا.</p>
          <p>
            <a href="#" class="btn btn-primary my-2">الدعوة الرئيسية للعمل</a>
            <a href="#" class="btn btn-secondary my-2">عمل ثانوي</a>
          </p>
        </div>
      </div>
    </section>

    <div class="album py-5 bg-body-tertiary">
      <div class="container">
        <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
          <div class="col" v-for="i in 12" :key="i">
            <Card />
          </div>

        </div>
      </div>
    </div>

  </div>
</template>
<script>
import Card from "@/components/Card.vue";

export default {
  name: "Home",
  components: {Card}
}
</script>

<style scoped>

</style>
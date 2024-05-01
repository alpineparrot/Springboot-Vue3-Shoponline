<template>
  <header data-bs-theme="dark">
    <div class="collapse text-bg-dark" id="navbarHeader">
      <div class="container">
        <div class="row">
          <div class="col-sm-8 col-md-7 py-4">
            <h4>حول</h4>
            <p class="text-body-secondary">أضف بعض المعلومات حول الألبوم، المؤلف، أو أي سياق خلفية آخر. اجعلها بضع جمل حتى يتمكن الزوار من التقاط بعض التلميحات المفيدة. ثم اربطها ببعض مواقع التواصل الاجتماعي أو معلومات الاتصال.</p>
          </div>
          <div class="col-sm-4 offset-md-1 py-4">
            <h4>تواصل معي</h4>
            <ul class="list-unstyled">
              <li><a href="#" class="text-white">تابعني على تويتر</a></li>
              <li><a href="#" class="text-white">شاركني الإعجاب في فيسبوك</a></li>
              <li><a href="#" class="text-white">راسلني على البريد الإلكتروني</a></li>
            </ul>
          </div>
        </div>
      </div>
    </div>
    <div class="navbar navbar-dark bg-dark shadow-sm">
      <div class="container">
        <a href="#" class="navbar-brand d-flex align-items-center">
          <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" aria-hidden="true" class="me-2" viewBox="0 0 24 24"><path d="M23 19a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V8a2 2 0 0 1 2-2h4l2-3h6l2 3h4a2 2 0 0 1 2 2z"/><circle cx="12" cy="13" r="4"/></svg>
          <strong>الألبوم</strong>
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarHeader" aria-controls="navbarHeader" aria-expanded="false" aria-label="تبديل التنقل">
          <span class="navbar-toggler-icon"></span>
        </button>
      </div>
    </div>
  </header>
</template>

<script>
export default {
  name: 'Header'
}
</script>

<style scoped>
</style>

# SoftwareLab4_BDD


# گزارش آزمایش چهارم آزمایشگاه نرم افزار(ایجاد مبتنی بر رفتار)

## بخش اول: انجام مراحل مطابق نمونه داده شده
در ابتدا یک پروژه maven می‌سازیم و نیازمندی‌ها را با توجه به سند داده شده اضافه می‌کنیم و maven test را اجرا می‌کنیم و پیام Build success را مطابق انتظار مشاهده می‌کنیم.

![image](https://github.com/user-attachments/assets/51a53122-ad50-47dd-a5b6-79759f4b1e89)

سپس مطابق مراحل گفته شده ساختار پروژه را ایجاد می‌کنیم و فایل‌های اصلی calculator.feature و کلاس Calculator و همچنین تعاریف استپ‌ها و سناریو را اضافه می‌کنیم و در ادامه RunnerTest.java  را نیز اضافه کرده و مراحل خواسته شده را انجام می‌دهیم:

![image](https://github.com/user-attachments/assets/720fb629-72e8-499c-978f-a1450201f68a)
![image](https://github.com/user-attachments/assets/0ebe6a3c-6c15-4048-a74a-3e19821a5596)
![image](https://github.com/user-attachments/assets/c01ab8e8-740a-4b76-95d1-e2494e330c57)
![image](https://github.com/user-attachments/assets/1582810c-7e77-4a52-8e11-b5ebaeb8e9f3)


## بخش دوم: پاسخگویی به سوالات 
این موارد تست کدامند؟
در هنگام اجرای تست‌ها مطابق مراحل گفته شده، هر ۳ تست موجود به این خطا برخورد می‌کنند:
![image](https://github.com/user-attachments/assets/62608da0-45f9-49c1-9819-0768d53fef0d)


علت بروز مشکل چیست؟ و 
مشکل را با تغییر کد برطرف نمایید:

علت بروز این مشکل این است که زمانی که ما تست‌ها را بدون اجراکننده تست یا همان TestRunnner اجرا می‌کنیم به خطای Undefined برخورد می‌کنیم و زمانی که با تست رانر اجرا می‌کنیم خطا برطرف می‌شود:
![image](https://github.com/user-attachments/assets/aa1ad76b-834d-4d8e-808e-d0f7507d28ea)
![image](https://github.com/user-attachments/assets/5227e950-60ee-48c0-a008-7b774a69fd52)
![image](https://github.com/user-attachments/assets/fa98b866-2ebe-416f-a6a0-c99e55b9e13a)
![image](https://github.com/user-attachments/assets/32aa7a9e-83e8-4c25-a5bc-ea49937e4087)





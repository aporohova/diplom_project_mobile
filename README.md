# Проект автоматизации Mobile тестирования для мобильного приложения Wikipedia
![site_logo.png](images/logo/Wikipedia.svg)

## **Содержание:**

____
* Технологии и инструменты
* Примеры автоматизированных тест-кейсов
* Сборка в Jenkins
* Запуск из терминала
* Allure отчет
* Интеграция с Allure TestOps
* Интеграция с JIRA
* Уведомления в Telegram при помощи бота
____

## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>

<p align="center"> 
<a href="https://developer.android.com/"><img src="images/logo/android-studio.svg" width="50" height="50"  alt="Android-studio"/></a>
<a href="https://appium.io/"><img src="images/logo/appium.svg" width="50" height="50" alt="Appium" title="Appium"/></a>
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/IntelliJ_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://selenide.org/"><img width="50" height="50" title="Selenide" src="images/logo/Selenide.svg">
<a href="https://www.java.com/"><img src="images/logo/Java_logo.svg" width="50" height="50"  alt="Java"/></a> 
<a href="https://www.browserstack.com/"><img src="images/logo/browserstack.svg" width="50" height="50" alt="Browserstack" title="Browserstack"/></a>
<a href="https://github.com/"><img src="images/logo/github.svg" width="38" height="40"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="40" height="45"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/logo/gradle.svg" width="40" height="50"  alt="Gradle"/></a>  
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://qameta.io/"><img src="images/logo/allure2.svg" width="55" height="55"  alt="Allure TestOps"/></a>   
<a href="https://www.jenkins.io/"><img src="images/logo/jenkins.svg" width="40" height="40"  alt="Jenkins"/></a>  
<a href="https://aerokube.com/selenoid/"><img width="50" height="50" title="Selenoid" src="images/logo/Selenoid.svg"></a>
<a href="https://www.atlassian.com/ru/software/jira/"><img src="images/logo/jira.svg" width="100" height="50" alt="Jira"/></a>
</p>

___
## <a name="Примеры автоматизированных тест-кейсов">**Примеры автоматизированных тест-кейсов:**</a>
___
* ✓ *Открытие найденной статьи*
* ✓ *Открытие статьи с главной страницы*
* ✓ *Проверка работы поиска*

___

## <img alt="Jenkins" height="25" src="images/logo/jenkins.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/diplom_project_mobile/)</a>

___
<p align="center">
<a href="https://jenkins.autotests.cloud/job/diploma_project_web/"><img src="images/screenshots/dashboard_jenkins_mob.png" alt="Jenkins" width="950"/></a>

***Для локального запуска:***
```bash  
✓  Создать файл browserstack.properties и разместить по адресу src/test/resources/browserstack.properties
✓  Файл должен содержать следующие данные: 
- username=username для browserstack.com
- accessKey=accessKey юзер
- baseUrl=http://hub.browserstack.com/wd/hub
- appUrl=bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c
- device=Google Pixel 3
- os_version=9.0
```
___
__
## <img alt="Allure" height="25" src="images/logo/Allure.svg" width="25"/></a> <a name="Allure"></a>Allure [отчет](https://jenkins.autotests.cloud/job/diplom_project_mobile/3/allure/)</a>

___

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screenshots/allure_main_mobile.png" width="850">  
</p>  

### *Тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="images/screenshots/allure_suites_mob.png" width="850">  
</p>

### *Графики*


  <p align="center">  
<img title="Allure Graphics" src="images/screenshots/graphs_mob.png" width="850">  
<img title="Allure Graphics" src="images/screenshots/graphs_mob2.png" width="850">  
</p>

___

## <img alt="Allure" height="25" src="images/logo/allure2.svg" width="35"/></a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/3610/dashboards">Allure TestOps</a>
___

### *Allure TestOps Dashboard*

<p align="center">
<img title="Allure TestOps Dashboard" src="images/screenshots/dashboard_mob.png" width="850">  
</p>

### *Авто тест-кейсы*

<p align="center">  
<img alt="Allure TestOps Tests" src="images/screenshots/cases_mob.png" width="850">  
</p>

___

## <img alt="Allure" height="25" src="images/logo/jira.svg" width="45"/></a> Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-845">Jira</a>
____
<p align="center">  
<img title="Jira" src="images/screenshots/jira_mob.png" width="">  
</p>

____

## <img alt="Allure" height="25" src="images/logo/telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота
____
<p align="center">  
<img title="Allure Overview Dashboard" src="images/screenshots/notif_mob.png" width="550">  
</p>

____
____
## <img alt="Selenoid" height="25" src="images/logo/Selenoid.svg" width="25"/></a> Пример видео выполнения одного из тестов на Selenoid
____
<p align="center">
<img title="Selenoid Video" src="images/video/video.gif" width="550" height="350"  alt="video">   
</p>
<h1 align="center">Clevertec java course</h1>
<h2 align="center">Lesson 2 - Gradle</h2>

<h3>Task</h3>
<li>Установить Gradle</li>
<li>Проект должен быть совместим с java 17</li>
<li>Создать файл.jar, например, «utils-1.3.5.jar»</li>
<li>Манифест файл должен содержать имя и версию вашего .jar файла</li>
<li>В вашем .jar файле должен быть class StringUtils с методом boolean isPositiveNumber(String str)</li>
<li>Написать один unit test для проверки этого метода (использовать JUnit 5).</li>
<li>Заполнить и отправить форму</li>


<h3>Дополнительно:</h3>
<li>Сделать gradle плагин, который также опубликовать и подключить к проекту, например плагин по формированию отчёта</li>
<li>Создать мульти-модульный проект с двумя модулями: core, api</li>
<li>В модуле core должен быть class Utils с методом boolean isAllPositiveNumbers(String… str)</li>
<li>Использовать utils-1.3.5.jar сделанный на предыдущих этапах, для возможности переиспользовать метод boolean isPositiveNumber(String str) в модуле core</li>
<li>В модуле api должен быть class App с методом main.</li>
<li>Из модуля api в методе main вызвать Utils.isAllPositiveNumbers("12", "79")</li>
<li>аписать один unit test для проверки этого метода boolean isAllPositiveNumbers(String… str)(использовать JUnit 5).</li>

<h3> Выполнение основной задачи</h3>
<p>*В проекте использован gradle-8.2, wrapper исключен из .gitignore</p>
<p>Был создан проект следующей структуры</p>

![Структура](desc/task_structure.jpg)

<p>В виде следующего дерева директорий</p>

![Дерево](desc/task_tree.jpg)

<p>Применены следующие настройки для jar</p>

![Конфигурация_jar](desc/build_jar_config.jpg)

<p>Формирующие следующий манифест согласно задания</p>

![Манифест](desc/manifest.jpg)

<p>Все методы описаны JavaDoc</p>

![JavaDoc](desc/java_doc.jpg)
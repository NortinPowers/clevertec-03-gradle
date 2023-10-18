<h1 align="center">Clevertec java course</h1>
<h2 align="center">Lesson 2 - Gradle</h2>

<h3>Task</h3>
<li>Установить Gradle</li>
<li>Проект должен быть совместим с java 17</li>
<li>Создать файл.jar, например, «util-1.3.5.jar»</li>
<li>Манифест файл должен содержать имя и версию вашего .jar файла</li>
<li>В вашем .jar файле должен быть class StringUtils с методом boolean isPositiveNumber(String str)</li>
<li>Написать один unit test для проверки этого метода (использовать JUnit 5).</li>
<li>Заполнить и отправить форму</li>


<h3>Дополнительно:</h3>
<li>Сделать gradle плагин, который также опубликовать и подключить к проекту, например плагин по формированию отчёта</li>
<li>Создать мульти-модульный проект с двумя модулями: core, api</li>
<li>В модуле core должен быть class Utils с методом boolean isAllPositiveNumbers(String… str)</li>
<li>Использовать util-1.3.5.jar сделанный на предыдущих этапах, для возможности переиспользовать метод boolean isPositiveNumber(String str) в модуле core</li>
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

<h3> Выполнение дополнительных задач (api/core)</h3>
<p>Созданы структуры core</p>

![Структура](desc/core_structure.jpg)

<p>и api</p>

![Структура](desc/api_structure.jpg)

<p>В виде следующих деревьев директорий</p>

![Дерево](desc/core_tree.jpg)
<p> </p>

![Дерево](desc/api_tree.jpg)

<p>Применены следующие настройки для jar в core</p>

![Конфигурация_jar](desc/core_impl_jar.jpg)

<p>Настройки .build для api</p>

![Конфигурация_jar](desc/api_impl_core.jpg)

<p>Тем самым обеспечены следующие зависимости</p>

![Зависимости](desc/depen_structure.jpg)

<h4>Исправления по итогам уточнений</h4>

<p>Перестроил проект, вынеся базовую задачу в отдельный модуль</p>

![Структура](desc/rebase.jpg)

<p>Сменил имплементацию на базовый метод, для исключения необходимости билда при проверке проекта</p>

![КонфигCoreNew](desc/core_impl_base.jpg)

<p>Добавил таску для плагина jacoco</p>

![КонфигJacoco](desc/jacoco_task.jpg)

<p>Настроил верификацию плагина jacoco</p>

![КонфигJacocoVerif](desc/jacoco_verif_conf.jpg)

<p>Получил отчет с охватом модуля basic тестами</p>

![JacocoRep](desc/jacoco_rep.jpg)

<h4>Создание и добавление плагина</h4>
<p>Так как плагин с отчетами хорош сам по себе и уже добавлен, то создал плагин на генерацию случайного числа</p>

![PluginGroovy](desc/custom_plugin_groovy.jpg)

<p>Расположил его в модуле buildSrc для автоматической компиляции и добавлении в classpath проекта</p>

![Дерево](desc/buildSrc_tree.jpg)

<p>Используя apply plugin: RandomNumberPlugin в build.gradle basic-модуля, получил в other таску</p>

![ТаскаBasicPlugin](desc/basic_plugin_task.jpg)

<p>И выполнил вручную, для проверки наделанного</p>

![ТаскаBasicPluginResult](desc/task_result.jpg)

<h3>Спасибо за внимание, хорошего дня!</h3>

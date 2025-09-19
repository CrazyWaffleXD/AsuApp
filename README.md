# Институтское приложение (Тестовый репозиторий) 🏫📱  

**Статус проекта:** В активной разработке 🚧  

Этот репозиторий содержит тестовую версию приложения для [Алтайского государственного университета, филиал в г. Бийск].  
Приложение разрабатывается студентами групп **305с9-1** в учебных целях.  
Все шаблоны "PRILAGUSHA" были взяты у групп " 205с9 и 305с11". Пасиба им большое !!! 

---

### 📌 **Основные функции (планируемые)**  
✅ Расписание занятий  
✅ Ежедневник (заметки, дедлайны)  
✅ Объявления от преподавателей  
🛠 Панель администратора (в разработке)  
❓ FAQ (в планах)  
👨‍💻 Информация о разработчиках  

---

### 🛠 **Технологии**  
- **Frontend**: Flutter (кросс-платформенность) / React Native  
- **Backend**: Firebase / Node.js (если потребуется)  
- **Дизайн**: Figma (макеты интерфейса)  

---

### 📂 **Структура репозитория**  

ASUApp001
├── app/
│   ├── manifests/
│   │   └── AndroidManifest.xml
│   ├── kotlin+java/
│   │   └── com.example.asuapp001/
│   │       └── ui/
│   │           ├── ad/
│   │           │   ├── AdFragment.kt
│   │           │   └── AdViewModel.kt
│   │           ├── AdminPanel/
│   │           │   ├── AdminPanel.kt
│   │           │   └── AdminPanelViewModel.kt
│   │           ├── diaryPrilagusha/
│   │           │   ├── diaryPrilagushaFragment.kt
│   │           │   └── diaryPrilagushaViewModel.kt
│   │           ├── gallery/
│   │           │   ├── GalleryFragment.kt
│   │           │   └── GalleryViewModel.kt
│   │           ├── home/
│   │           │   ├── HomeFragment.kt
│   │           │   └── HomeViewModel.kt
│   │           ├── fragment_bopros.kt
│   │           ├── fragment_creators.kt
│   │           ├── FragmentCreatorsViewModel.kt
│   │           └── MainActivity.kt
│   ├── res/
│   │   ├── drawable/
│   │   │   ├── fon.jpg
│   │   │   ├── logo1.png
│   │   │   ├── ic_launcher_foreground.xml
│   │   │   └── fonts.ttf
│   │   ├── layout/
│   │   │   ├── activity_main.xml
│   │   │   ├── fragment_ad.xml
│   │   │   └── nav_header_main.xml
│   │   ├── menu/
│   │   │   ├── main.xml
│   │   │   └── activity_main_drawer.xml
│   │   ├── mipmap/
│   │   │   ├── ic_launcher.webp
│   │   │   └── ic_launcher_round.webp
│   │   ├── navigation/
│   │   │   └── mobile_navigation.xml
│   │   ├── values/
│   │   │   ├── colors.xml
│   │   │   ├── strings.xml
│   │   │   └── themes.xml
│   │   └── xml/
│   │       ├── backup_rules.xml
│   │       └── data_extraction_rules.xml
│   └── Gradle Scripts/
│       ├── build.gradle.kts(Project: ASUapp001)
│       ├── build.gradle.kts(Module: app)
│       ├──proguard-rules.pro
│       ├──gradle.properties
│       ├──gradle-wrapper.properties
│       ├──libs.versions.toml
│       ├──local.properties
│       └── settings.gradle.kts
└── ...

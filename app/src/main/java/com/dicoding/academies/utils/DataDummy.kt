package com.dicoding.academies.utils

import com.dicoding.academies.data.CourseEntity
import com.dicoding.academies.data.DataModule
import com.dicoding.academies.data.ModuleEntity

import java.util.ArrayList

object DataDummy {

    fun generateDummyCourses(): ArrayList<CourseEntity> {

        val courses = ArrayList<CourseEntity>()

        courses.add(
                CourseEntity(
                        "1",
                        "Menjadi Android Developer Expert",
                        "Dicoding sebagai satu-satunya Google Authorized Training Partner di Indonesia telah melalui proses penyusunan kurikulum secara komprehensif. Semua modul telah diverifikasi langsung oleh Google untuk memastikan bahwa materi yang diajarkan relevan dan sesuai dengan kebutuhan industri digital saat ini. Peserta akan belajar membangun aplikasi Android dengan materi Testing, Debugging, Application, Application UX, Fundamental Application Components, Persistent Data Storage, dan Enhanced System Integration.",
                        "100 Hari",
                        false,
                        "https://www.dicoding.com/images/small/academy/menjadi_android_developer_expert_logo_070119140352.jpg"
                )
        )
        courses.add(
                CourseEntity(
                        "2",
                        "Kotlin Android Developer Expert",
                        "Pada Google I/O 2017, Kotlin diumumkan sebagai bahasa pemrograman yang termasuk dalam bahasa kelas satu (First class) yang didukung untuk pembuatan aplikasi Android, selain Java dan C++. Kotlin adalah bahasa pemrograman yang dibuat oleh JetBrains. Google juga akan memastikan bahwa semua fitur baru di Android, framework, IDE dan keseluruhan library, akan dapat bekerja dan terintegrasi baik dengan bahasa pemrograman Kotlin serta interopable dengan fungsi-fungsi Java yang telah ada sehingga memungkinkan para engineer melakukan perubahan bagian tertentu aplikasi dari Java ke Kotlin dan sebaliknya dengan sangat mudah.",
                        "50 Hari",
                        false,
                        "https://www.dicoding.com/images/small/academy/kotlin_android_developer_expert_logo_070119140227.jpg"
                )
        )
        courses.add(
                CourseEntity(
                        "3",
                        "Menjadi Game Developer Expert",
                        "Semua modul dalam kelas ini telah diverifikasi langsung oleh Asosiasi Game Indonesia (AGI) untuk memastikan materi yang diajarkan relevan dan sesuai dengan kebutuhan industri game saat ini. Peserta akan belajar best practice membuat game seperti Script, Sprite, UI, Gameplay, Input Method, Porting ke Android / iOS, Modul Services (Collaboration, Ads, Analytics dan Google Play Games - Update Oktober 2018), Porting ke VR - Cardboard dan Gear VR (New Mei 2018) dengan Unity 3D. Peserta juga akan belajar langsung membuat 8 game yaitu Casual (Update Agustus 2018), Pilah Sampah (New November 2018), Tower Defense (New November 2018), Arcade (Update Maret 2018), Platformer (Update Januari 2019), FPS, Multiplayer (Update Maret 2018), serta Game Interaktif dengan VR (New Mei 2018).",
                        "75 Hari",
                        false,
                        "https://www.dicoding.com/images/small/academy/menjadi_game_developer_expert_logo_070119140532.jpg"
                )
        )
        courses.add(
                CourseEntity(
                        "4",
                        "Membangun Progressive Web Apps",
                        "Progressive Web Apps adalah aplikasi web yang memanfaatkan beragam fitur web modern sehingga dapat menyajikan pengalaman pengguna seperti aplikasi native. PWA mengubah sajian tampilan yang umumnya dibuka melalui halaman browser menjadi jendela aplikasi tersendiri. Selain itu PWA juga memungkinkan konten halaman diakses dalam mode offline, menampilkan pesan pemberitahuan, hingga akses ke hardware dari perangkat seperti halnya native app.",
                        "50 Hari",
                        false,
                        "https://www.dicoding.com/images/small/academy/membangun_progressive_web_apps_logo_070119142922.jpg"
                )
        )
        courses.add(
                CourseEntity(
                        "5",
                        "Belajar Android Jetpack Pro",
                        "Android Jetpack terinspirasi oleh Support Library, seperangkat komponen untuk memudahkan pemanfaatan fitur Android terbaru sembari tetap menjaga kompatibilitas dengan versi-versi sebelumnya. Google memperkenalkan Architecture Components sebagai bagian dari Android Jetpack yang dirancang untuk memudahkan penanganan data dalam menghadapi perubahan siklus hidup aplikasi. Sejak Google perkenalkan pada I/O 2018, banyak sekali dari perusahaan IT yang telah mengadopsinya. Google menyatakan bahwa Android Jetpack digunakan oleh 80% dari 1000 aplikasi terbaik Google Play Store. Perusahaan seperti LinkedIn, Traveloka dan Kakao Corporation (KakaoTalk) menjumpai lebih sedikit bug dan sukses menghemat waktu pengembangan sehingga dapat lebih berfokus pada apa yang membuat aplikasi mereka unik.",
                        "30 Hari",
                        false,
                        "https://d17ivq9b7rppb3.cloudfront.net/original/academy/belajar_android_jetpack_pro_logo_071119141410.png"
                )
        )
        courses.add(
                CourseEntity(
                        "6",
                        "Belajar Fundamental Aplikasi Android",
                        "Android semakin digandrungi. Per Maret 2018 ada lebih dari 3,6 juta aplikasi Android di Google Play Store (data Statista). Di indonesia sendiri pada bulan Maret 2019 sebanyak 93,5% konsumen memilih platform Android untuk sistem operasi peranti mobile mereka (data Statcounter). Ini menandakan bahwa kebutuhan akan Android developer, semakin meningkat. Tak heran, profesi Android developer merupakan 1 dari 5 profesi yang paling diincar perusahaan (data LinkedIn Emerging Jobs Report 2019).",
                        "100 Hari",
                        false,
                        "https://d17ivq9b7rppb3.cloudfront.net/original/academy/menjadi_android_developer_expert_logo_071119140536.png"
                )
        )
        courses.add(
                CourseEntity(
                        "7",
                        "Menjadi Azure Cloud Developer",
                        "Komputasi awan menjadi tren baru di dunia teknologi yang banyak dibicarakan. Diperkirakan pada tahun 2025, 80% organisasi akan memindahkan beban kerjanya ke cloud. Azure memiliki lebih dari 100 layanan untuk membangun dan mengelola aplikasi. Microsoft Azure memiliki 54 region data center yang tersebar di seluruh dunia, lebih banyak dari cloud provider manapun, untuk melayani seluruh pelanggannya termasuk perusahaan seperti Spotify, Unilever, SAP, dsb.",
                        "50 Hari",
                        false,
                        "https://d17ivq9b7rppb3.cloudfront.net/original/academy/menjadi_azure_cloud_developer_logo_120720211415.png"
                )
        )
        courses.add(
                CourseEntity(
                        "8",
                        "Membangun Progressive Web Apps",
                        "Progressive Web Apps adalah aplikasi web yang memanfaatkan beragam fitur web modern sehingga dapat menyajikan pengalaman pengguna seperti aplikasi native. PWA mengubah sajian tampilan yang umumnya dibuka melalui halaman browser menjadi jendela aplikasi tersendiri. Selain itu PWA juga memungkinkan konten halaman diakses dalam mode offline, menampilkan pesan pemberitahuan, hingga akses ke hardware dari perangkat seperti halnya native app.",
                        "50 Hari",
                        false,
                        "https://www.dicoding.com/images/small/academy/membangun_progressive_web_apps_logo_070119142922.jpg"
                )
        )
        courses.add(
                CourseEntity(
                        "9",
                        "Menjadi Front End Web Developer",
                        "Kelas ini membahas tuntas aspek mobile friendly, web accessibility, dan web optimization. Selain itu, Anda akan belajar membuat website yang progressive sehingga website memiliki sifat layaknya aplikasi native bersama dengan kurikulum Mobile Web Specialist dari Google. Kurikulum telah disusun dan diverifikasi oleh tim expert Dicoding bersama praktisi industri agar materi yang disajikan terstruktur dan komprehensif.",
                        "30 Hari",
                        false,
                        "https://d17ivq9b7rppb3.cloudfront.net/original/academy/menjadi_mobile_web_specialist_logo_230320225628.jpg"
                )
        )
        courses.add(
                CourseEntity(
                        "10",
                        "Menjadi iOS Developer Expert",
                        "Walaupun market share pengguna mobile platform iOS hanya sebesar 28.79% (data Statcounter, April 2020), banyak perusahaan yang berlomba membuat aplikasi iOS agar dapat menjangkau pasar. Namun kesuksesan sebuah aplikasi terbentur kompetisi (ada lebih dari 2.2 juta aplikasi di App Store) dan mahalnya biaya akuisisi pengguna. Maka diperlukan aplikasi dengan performa tinggi supaya dapat bersaing dan meningkatkan retensi pengguna. Minimnya bug, keamanan, dan ukuran aplikasi adalah beberapa faktor lain yang perlu diperhatikan untuk kenyamanan pengguna. Dari sisi kode, aplikasi harus scalable (tetap bekerja dengan baik saat produk berubah) untuk mengikuti kebutuhan bisnis dan robust (kode yang kuat) saat dikembangkan. Jika tidak, perusahaan akan terbebani biaya pengembangan yang tinggi karena sulitnya perbaikan akibat code smell (berantakan atau berstruktur buruk).",
                        "30 Hari",
                        false,
                        "https://d17ivq9b7rppb3.cloudfront.net/original/academy/menjadi_ios_developer_expert_logo_230320222603.jpg"
                )
        )
        return courses
    }


    fun generateDummyDataModule(): ArrayList<DataModule> {

        val dataModule = ArrayList<DataModule>()

        dataModule.add(
                DataModule(
                        "1",
                        "Memulai Pemrograman Dengan Java",
                        "Kelas ini didesain oleh para pelaku industri bersama tim expert dari Dicoding. Materi telah direview oleh Dr. Ir. Inggriani Liem (ITB/IA TOKI/BEBRAS NBO) dan sudah disesuaikan untuk Anda yang ingin mempelajari konsep Pemrograman Berorientasi Objek (PBO) maupun mempelajari struktur bahasa Java secara umum.",
                        "100 Hari",
                        false,
                        "https://d17ivq9b7rppb3.cloudfront.net/original/academy/memulai_pemrograman_dengan_java_logo_071119140151.png"
                )
        )
        dataModule.add(
                DataModule(
                        "2",
                        "Memulai Pemrograman Dengan Python",
                        "Kelas ini didesain oleh Dicoding bersama Google beserta para innovator dan engineer pada industri teknologi yang setiap harinya menggunakan Python sebagai bahasa pemrogramannya seperti Akhmat Safrudin (Python-ID), Doni Rubiagatra (Kumparan), Oon Arfiandwi (7Langit), Sofian Hadiwijaya (Warung Pintar), dan Tegar Imansyah (Python-ID Surabaya).\n" +
                                "\n",
                        "50 Hari",
                        false,
                        "https://d17ivq9b7rppb3.cloudfront.net/original/academy/memulai_pemrograman_dengan_python_logo_071119140316.png"
                )
        )
        dataModule.add(
                DataModule(
                        "3",
                        "Memulai Pemrograman Dengan Kotlin",
                        "Kotlin merupakan bahasa utama yang digunakan dalam pengembangan Android. Saat ini, Kotlin sudah stabil dan banyak digunakan oleh industri, seperti Gojek, Netflix, Twitter dan masih banyak lagi. Selain pengembangan Android, Kotlin dapat digunakan untuk berbagai macam pengembangan aplikasi, baik itu server atau backend, maupun website. Bahkan saat ini tengah dikembangkan Kotlin/Native, yang memungkinkan developer untuk menggunakannya sebagai bahasa pemrograman dalam pengembangan aplikasi di platform lain seperti embedded system, desktop, macOS, dan iOS. Banyaknya komunitas yang berkontribusi untuk Kotlin membuat bahasa ini berkembang sangat pesat. Kotlin dinobatkan sebagai “Fastest growing languages” oleh GitHub Octoverse 2018 mengalahkan Rust, Go, dll.",
                        "75 Hari",
                        false,
                        "https://d17ivq9b7rppb3.cloudfront.net/original/academy/memulai_pemrograman_dengan_kotlin_logo_071119141033.png"
                )
        )
        dataModule.add(
                DataModule(
                        "4",
                        "Belajar Prinsip Pemrograman SOLID",
                        "Semua orang bisa membuat kode program selama dia tahu suatu bahasa pemrograman. Tetapi membuat kode program yang mudah dimengerti, mudah dikelola, dan mudah dikembangkan adalah tantangan yang nyata, bahkan untuk seorang yang sudah menjadi programmer sekali pun. Tergantung dari paradigma apa yang dipakai, pasti ada solusi yang bisa digunakan untuk menyelesaikan problem tersebut. Di dalam paradigma OOP (object oriented programming atau pemrograman berorientasi object), dikenal prinsip SOLID yang memiliki tujuan untuk membuat kode program lebih mudah dimengerti, mudah dikelola, dan mudah dikembangkan. Robert C Martin (Uncle Bob) adalah seorang engineer dan instructor dari Amerika mengenalkan SOLID di papernya yang berjudul Design Principle and Design Pattern pada tahun 2000.\n" +
                                "\n",
                        "50 Hari",
                        false,
                        "https://d17ivq9b7rppb3.cloudfront.net/original/academy/belajar_prinsip_pemrograman_solid_logo_160320152324.png"
                )
        )
        dataModule.add(
                DataModule(
                        "5",
                        "Belajar Membuat Aplikasi Android untuk Pemula",
                        "Kelas ini didesain oleh Google Authorized Training Partner untuk developer Android di Indonesia. Peserta akan mempelajari materi dasar Android dalam 30 hari dan diarahkan untuk membuat aplikasi sederhana. Terdapat 27 modul yang juga merupakan bagian dari Kelas Menjadi Android Developer Expert. Peserta disarankan setidaknya memiliki pengetahuan tentang programming Java dan atau pemrograman berorientasi objek. Sistem pembelajaran adalah online (dapat diakses kapanpun dan darimanapun selama tersedia internet) dan kehadiran tatap muka tidak diperlukan. Tools yang diwajibkan untuk kelas belajar Android ini adalah Android Studio. Peserta harus submit satu proyek akhir yang akan direview oleh developer expert untuk mendapatkan sertifikat dari kelas ini. Bila menginginkan materi yang lebih komprehensif, silahkan mengikuti kelas Menjadi Android Developer Expert.",
                        "30 Hari",
                        false,
                        "https://www.dicoding.com/images/small/academy/belajar_membuat_aplikasi_android_untuk_pemula_logo_070119140911.jpg"
                )
        )
        dataModule.add(
                DataModule(
                        "6",
                        "Memulai Pemrograman Dengan Swift",
                        "Sejak dikenalkan di Apple Wordwide Developer Conference (WWDC) di tahun 2014, Swift telah menjadi bahasa resmi yang didukung oleh Apple Inc. untuk pengembangan aplikasi iOS, iPadOs, macOS, watchOS, tvOS, Linux, dan OS X. Swift merupakan bahasa pemrograman yang modern, cepat dan type-safe. Di tahun 2018, Swift telah mengalahkan Objective-C sebagai bahasa pemrograman yang digunakan untuk iOS dan platform Apple lainnya. Menurut survei yang dilakukan Stack Overflow, Swift menjadi bahasa pemrograman yang paling disukai tahun 2019. Dibandingkan dengan 2018, pecinta Swift naik dari 65% menjadi 69%.",
                        "100 Hari",
                        false,
                        "https://d17ivq9b7rppb3.cloudfront.net/original/academy/memulai_pemrograman_dengan_swift_logo_311219165842.png"
                )
        )
        dataModule.add(
                DataModule(
                        "7",
                        "Belajar Membuat Aplikasi iOS untuk Pemula",
                        "Menjadi iOS developer merupakan pekerjaan yang diimpikan bagi banyak orang. Menurut data dari Indeed, salah satu platform pencari pekerjaan terbesar di dunia, tingkat kepuasan menjadi iOS developer itu 13% lebih tinggi dibandingkan dengan profesi Android Developer. The iOS Developer Community Survey menemukan bahwa di tahun 2020, 75.5% dari developer masih menggunakan codebase terpisah ketika aplikasinya perlu dapat dijalankan di berbagai platform yang berbeda (seperti OS Android dan iOS). Artinya banyak tempat kerja yang masih menginginkan codebase yang terpisah dan benar-benar dibangun dari Xcode. Oleh karena ini, permintaan industri untuk seorang iOS Developer masih sangat tinggi walaupun market share pengguna mobile platform iOS hanya sebesar 26% (data Statcounter, Februari 2020).",
                        "50 Hari",
                        false,
                        "https://d17ivq9b7rppb3.cloudfront.net/original/academy/belajar_membuat_aplikasi_ios_untuk_pemula_logo_110320143925.png"
                )
        )
        dataModule.add(
                DataModule(
                        "8",
                        "Menjadi Google Cloud Engineer",
                        "Cloud computing adalah hard skill yang paling dibutuhkan oleh perusahaan di tahun 2019 menurut survey dari LinkedIn. Diperkirakan pada tahun 2025, 80% organisasi akan memindahkan beban kerjanya ke cloud. Google Cloud memungkinkan Anda menjalankan aplikasi Anda di infrastruktur yang sama dengan aplikasi populer dari Google, seperti Youtube dan Gmail. Google Cloud memiliki 20 region data center yang tersebar di seluruh dunia. Google Cloud juga digunakan oleh perusahaan di banyak industri seperti GoJek, eBay, dan ANA.",
                        "75 Hari",
                        false,
                        "https://d17ivq9b7rppb3.cloudfront.net/original/academy/menjadi_google_cloud_engineer_logo_071119141421.png"
                )
        )
        dataModule.add(
                DataModule(
                        "9",
                        "Belajar Membuat Aplikasi Flutter untuk Pemula",
                        "Sejak dikenalkan oleh Google pada Mei 2017, Flutter langsung menarik perhatian. UI toolkit dari Google ini memungkinkan developer untuk mengembangkan aplikasi di berbagai platform mobile seperti Android dan iOS. Bahkan pada pengembangan terbarunya, Flutter tidak hanya digunakan pada platform mobile, namun sudah merambah ke sisi web dan desktop. Flutter sendiri telah digunakan oleh berbagai perusahaan besar seperti Google, Alibaba.com, dan Tencent. Berbagai perusahaan tersebut memilih Flutter karena hanya membutuhkan satu codebase untuk mengembangkan aplikasi di berbagai platform, alhasil dapat menghemat waktu, tenaga, dan juga biaya. Menurut data Google, di tahun 2020 sudah ada 50.000 aplikasi di Google Play yang dibuat dengan menggunakan Flutter, dan angka ini akan terus bertambah. ",
                        "50 Hari",
                        false,
                        "https://d17ivq9b7rppb3.cloudfront.net/original/academy/belajar_membuat_aplikasi_flutter_untuk_pemula_logo_230320223038.jpg"
                )
        )
        dataModule.add(
                DataModule(
                        "10",
                        "Menjadi AWS Solutions Architect Associate",
                        "Amazon Web Services (AWS) adalah platform layanan Cloud yang menawarkan kemampuan komputasi, penyimpanan database, content delivery, dan berbagai fungsionalitas yang membantu bisnis untuk terus tumbuh dan berkembang. AWS telah menjadi pilihan berbagai perusahaan terkemuka di dunia, misalnya Spotify, Airbnb, dan SoundCloud. Mari belajar untuk menggunakan produk/layanan Cloud AWS untuk membangun produk dengan fleksibilitas, skalabilitas, dan reliabilitas yang dipercaya perusahaan terbaik. Menurut Gartner, AWS memimpin pasar cloud dengan total revenue US\$ 15,5 milyar dan menguasai 47,8% pasar Cloud-Infrastructure-as-a-Service.",
                        "30 Hari",
                        false,
                        "https://d17ivq9b7rppb3.cloudfront.net/original/academy/belajar_menjadi_aws_solutions_architect_associate_logo_071119141240.png"
                )
        )

        return dataModule
    }

    fun generateDummyModules(courseId: String): ArrayList<ModuleEntity> {

        val modules = ArrayList<ModuleEntity>()

        modules.add(ModuleEntity(
                "{$courseId}m1",
                courseId,
                "Modul 0 : Introduction",
                0))
        modules.add(ModuleEntity("{$courseId}m2",
                courseId,
                "Modul 1 : Teori 1",
                1, false))
        modules.add(ModuleEntity("{$courseId}m3",
                courseId,
                "Latihan 1",
                2, false))
        modules.add(ModuleEntity("{$courseId}m4",
                courseId,
                "Bedah Kode 1",
                3, false))
        modules.add(ModuleEntity("{$courseId}m5",
                courseId,
                "Modul 2 : Teori 2",
                4, false))

        modules.add(ModuleEntity("{$courseId}m6",
                courseId,
                "Latihan 2",
                5, false))

        modules.add(ModuleEntity("{$courseId}m7",
                courseId,
                "Bedah Kode 2",
                6, false))

        return modules
    }
}
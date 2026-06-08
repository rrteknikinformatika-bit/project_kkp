<!DOCTYPE html>
<html>
<head>
    <title>Sistem Informasi Perusahaan</title>
    <style>
        body{
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 20px;
        }

        .container{
            width: 80%;
            margin: auto;
        }

        .box{
            background-color: white;
            border: 1px solid #ccc;
            border-radius: 8px;
            padding: 15px;
            margin-bottom: 15px;
        }

        h1{
            text-align: center;
            color: #333;
        }

        input, textarea{
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            margin-bottom: 10px;
        }

        button{
            padding: 10px 15px;
        }
    </style>
</head>
<body>

<div class="container">

    <h1>SISTEM INFORMASI PERUSAHAAN</h1>

    <?php include("profil.php"); ?>
    <?php include("visi_misi.php"); ?>
    <?php include("contact.php"); ?>
    <?php include("bukutamu.php"); ?>

</div>

</body>
</html>

========================================
PROFIL
========================================
<div class="box">
    <h2>Profil Perusahaan</h2>

    <p>
        PT Maju Bersama adalah perusahaan yang bergerak di bidang Teknologi Informasi,
        Pengembangan Perangkat Lunak, dan Solusi Digital Terintegrasi. Dengan didukung
        oleh tim profesional yang berpengalaman, kami berkomitmen untuk membantu
        perusahaan, instansi, dan pelaku usaha dalam meningkatkan efisiensi, produktivitas,
        serta daya saing melalui pemanfaatan teknologi yang inovatif dan berkelanjutan.
    </p>

    <p>
        Layanan kami mencakup pengembangan aplikasi berbasis web dan mobile, sistem
        informasi perusahaan, integrasi teknologi, konsultasi IT, serta pemeliharaan dan
        dukungan teknis. Dalam setiap proyek, kami mengedepankan kualitas, keamanan,
        dan kepuasan pelanggan sebagai prioritas utama.
    </p>

    <p>
        Dengan mengadopsi teknologi terkini dan standar industri terbaik, PT Maju Bersama
        terus berinovasi untuk menghadirkan solusi yang efektif, efisien, dan sesuai dengan
        kebutuhan bisnis yang terus berkembang. Kami percaya bahwa teknologi merupakan
        kunci utama dalam mendorong transformasi digital dan pertumbuhan bisnis di era modern.
    </p>
</div>

========================================
VISI_MISI
========================================
<div class="box">
    <h2>Visi dan Misi Perusahaan</h2>

    <div class="section">
        <h3>Visi</h3>
        <p>
            Menjadi perusahaan teknologi informasi dan pengembangan perangkat
            lunak yang unggul, terpercaya, dan inovatif dalam menghadirkan
            solusi digital berkualitas tinggi untuk mendukung transformasi
            bisnis, meningkatkan efisiensi dan daya saing pelanggan, serta
            memberikan nilai tambah yang berkelanjutan bagi mitra, masyarakat,
            dan perkembangan ekonomi digital di Indonesia.
        </p>
    </div>

    <div class="section">
        <h3>Misi</h3>
        <ul>
            <li>Menyediakan solusi teknologi informasi yang andal, aman, dan sesuai kebutuhan pelanggan.</li>
            <li>Mengembangkan produk dan layanan berbasis teknologi terkini.</li>
            <li>Meningkatkan kompetensi sumber daya manusia secara berkelanjutan.</li>
            <li>Mendorong inovasi, kreativitas, dan kolaborasi dalam setiap proses bisnis.</li>
            <li>Menjalankan usaha secara profesional, berintegritas, dan berorientasi pada kepuasan pelanggan.</li>
            <li>Berkontribusi terhadap perkembangan teknologi dan kemajuan masyarakat.</li>
        </ul>
    </div>
</div>

========================================
CONTACT
========================================
<div class="box">
    <h2>Contact Perusahaan</h2>

    <p>Email : rianwangi2@gmail.com</p>
    <p>Telepon : 089514393020</p>
    <p>Alamat : bogor</p>
</div>

========================================
BUKUTAMU
========================================
<div class="box">
    <h2>Buku Tamu</h2>

    <form method="post">
        Nama :
        <input type="text" name="nama" required>

        Email :
        <input type="email" name="email" required>

        Pesan :
        <textarea name="pesan" rows="4" required></textarea>

        <button type="submit" name="kirim">Kirim</button>
    </form>

    <?php
    if(isset($_POST['kirim']))
    {
        $nama = $_POST['nama'];
        $email = $_POST['email'];
        $pesan = $_POST['pesan'];
        $tanggal = date('d-m-Y H:i:s');

        echo "<hr>";
        echo "<h3>Data Buku Tamu</h3>";
        echo "<p><b>Nama:</b> $nama</p>";
        echo "<p><b>Email:</b> $email</p>";
        echo "<p><b>Pesan:</b> $pesan</p>";
        echo "<p><b>Waktu:</b> $tanggal</p>";
    }
    ?>
</div>
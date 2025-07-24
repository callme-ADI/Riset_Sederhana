# Riset_Sederhana
Buat riset sederhana tentang tingkat paralel pada suatu test.   
Berikan laporan time (waktu) jika ada 2 atau lebih test menggunakan sekuensial. 
Berikan laporan time (waktu) jika ada 2 atau lebih test menggunakan paralel. 
Berikan insight dari kedua hasil tersebut. 

# Tujuan Riset
Mengukur waktu eksekusi beberapa "unit test" (disimulasikan dengan Thread.sleep) secara:
Sekuensial (berurutan)
Paralel (bersamaan)

# Insight
Paralel jauh lebih cepat, karena semua test berjalan serentak.
Sangat bermanfaat dalam sistem testing besar atau waktu build panjang.
Perlu diperhatikan thread safety, terutama jika test mengakses resource yang sama (misalnya database atau file).

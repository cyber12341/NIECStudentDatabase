package niecindonesia.niecstudentdatabase;

/**
 * Created by Admin on 12/04/2018.
 */

public class Student_Data {
    public String nama_student;
    public String alamat_student;
    public String no_hp_student;
    public String stats_student;
    public String tgl_lahir_student;
    public String sumber_info_student;
    public String negara_tujuan_student;
    public String photo_student;
    public String id_consultant_student;
    public String sekolah_asal_student;
    public String email_student;
    public String type_student;
    public String location_student;
    public String id_student;

    public Student_Data()
    {

    }

    public Student_Data(String id_student, String nama_student, String alamat_student, String tgl_lahir_student,
                        String no_hp_student, String email_student, String stats_student, String sekolah_asal_student, String sumber_info_student,
                        String negara_tujuan_student, String photo_student, String id_consultant_student, String type_student, String location_student)
    {
        this.id_student = id_student;
        this.nama_student = nama_student;
        this.alamat_student = alamat_student;
        this.tgl_lahir_student = tgl_lahir_student;
        this.no_hp_student = no_hp_student;
        this.email_student = email_student;
        this.stats_student = stats_student;
        this.sekolah_asal_student = sekolah_asal_student;
        this.sumber_info_student = sumber_info_student;
        this.negara_tujuan_student = negara_tujuan_student;
        this.photo_student = photo_student;
        this.id_consultant_student = id_consultant_student;
        this.type_student = type_student;
        this.location_student = location_student;
    }

    public String getSekolah_asal_student() {
        return sekolah_asal_student;
    }

    public void setSekolah_asal_student(String sekolah_asal_student) {
        this.sekolah_asal_student = sekolah_asal_student;
    }


    public String getEmail_student() {
        return email_student;
    }

    public void setEmail_student(String email_student) {
        this.email_student = email_student;
    }

    public String getNama_student() {
        return nama_student;
    }

    public void setNama_student(String nama_student) {
        this.nama_student = nama_student;
    }

    public String getAlamat_student() {
        return alamat_student;
    }

    public void setAlamat_student(String alamat_student) {
        this.alamat_student = alamat_student;
    }

    public String getNo_hp_student() {
        return no_hp_student;
    }

    public void setNo_hp_student(String no_hp_student) {
        this.no_hp_student = no_hp_student;
    }

    public String getStats_student() {
        return stats_student;
    }

    public void setStats_student(String stats_student) {
        this.stats_student = stats_student;
    }

    public String getTgl_lahir_student() {
        return tgl_lahir_student;
    }

    public void setTgl_lahir_student(String tgl_lahir_student) {
        this.tgl_lahir_student = tgl_lahir_student;
    }

    public String getSumber_info_student() {
        return sumber_info_student;
    }

    public void setSumber_info_student(String sumber_info_student) {
        this.sumber_info_student = sumber_info_student;
    }

    public String getNegara_tujuan_student() {
        return negara_tujuan_student;
    }

    public void setNegara_tujuan_student(String negara_tujuan_student) {
        this.negara_tujuan_student = negara_tujuan_student;
    }

    public String getPhoto_student() {
        return photo_student;
    }

    public void setPhoto_student(String photo_student) {
        this.photo_student = photo_student;
    }

    public String getId_consultant_student() {
        return id_consultant_student;
    }

    public void setId_consultant_student(String id_consultant_student) {
        this.id_consultant_student = id_consultant_student;
    }

    public String getType_student() {
        return type_student;
    }

    public void setType_student(String type_student) {
        this.type_student = type_student;
    }

    public String getLocation() {
        return location_student;
    }

    public void setLocation(String location_student) {
        this.location_student = location_student;
    }

    public String getId_student() {
        return id_student;
    }

    public void setId_student(String id_student) {
        this.id_student = id_student;
    }

}

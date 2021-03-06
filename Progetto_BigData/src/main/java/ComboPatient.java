//classe che permette di scegliere i pazienti dalla combobox
public class ComboPatient {
    private String name;
    private String id;
    private String masterkey;

    public ComboPatient(){
        this.name = "Nessuno";
        this.id = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMasterkey() {
        return masterkey;
    }

    public void setMasterkey(String masterkey) {
        this.masterkey = masterkey;
    }

    @Override
    public String toString() {
        return name;
    }
}

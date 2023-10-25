package pertemuan5;

    // class turunan atau warisan dari class person dinamakan sub class / anak class
public class customer extends person {

        private String id;
        //constructor



        public customer(String nama, String alamat, String id) {
            super(nama, alamat);
            this.id = id;
        }


        //overriding method
        public String getId() {
            return id;
        }

        @Override
        public String getNama() {
            return super.getNama();
        }

        @Override
        public String getAlamat() {
            return super.getAlamat();
        }
    }


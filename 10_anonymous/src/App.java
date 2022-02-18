
public class App {
    public static void main(String[] args) throws Exception {

        // with anonymous
        Button btn = new Button();
        // anonymous
        btn.setClickAction(new Clickable() {
            @Override
            public void onClick() {
                System.out.println("Tombol sudah diklik!");
            }
        });
        btn.doClick();


        // with anonymous using lambda
        Button btnLamda = new Button();
        // anonymous
        btnLamda.setClickAction(() -> {
            System.out.println("Tombol sudah diklik! dengan lambda");
        });
        btnLamda.doClick();


        // without anonymous
        Button button = new Button();
        Clickable submitButton = new SubmitPost();
        button.setClickAction(submitButton);
        button.doClick();
    }
}

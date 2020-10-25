package adapter;

/**
 * 継承ver
 */
// public class PrintBanner extends Banner implements Print {
//     public PrintBanner(String string) {
//         super(string);
//     }

//     public void printWeak() {
//         showWithParen();
//     }

//     public void printStrong() {
//         showWithAster();
//     }
// }

/**
 * 委譲ver
 */
public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    public void printWeak() {
        banner.showWithParen();
    }

    public void printStrong() {
        banner.showWithAster();
    }
}

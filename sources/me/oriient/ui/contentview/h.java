package me.oriient.ui.contentview;

/* loaded from: classes8.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ ContentView e;

    public /* synthetic */ h(ContentView contentView, int i) {
        this.d = i;
        this.e = contentView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ContentView.removeContent$lambda$32(this.e);
                break;
            case 1:
                ContentView.updateContent$lambda$26(this.e);
                break;
            case 2:
                ContentView.addContent$lambda$31(this.e);
                break;
            case 3:
                ContentView.setContent$lambda$30(this.e);
                break;
            case 4:
                ContentView.clearLayer$lambda$34(this.e);
                break;
            case 5:
                ContentView.applyNewMatrix$lambda$2(this.e);
                break;
            case 6:
                ContentView.setOrUpdateContent$lambda$25(this.e);
                break;
            case 7:
                ContentView.removeAllContent$lambda$33(this.e);
                break;
            case 8:
                ContentView.setBackground$lambda$29(this.e);
                break;
            default:
                ContentView.setBackgroundContent$lambda$27(this.e);
                break;
        }
    }
}

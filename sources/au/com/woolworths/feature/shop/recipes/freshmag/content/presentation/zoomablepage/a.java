package au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.zoomablepage;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ ZoomablePageLoaderListener e;

    public /* synthetic */ a(ZoomablePageLoaderListener zoomablePageLoaderListener, int i) {
        this.d = i;
        this.e = zoomablePageLoaderListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                this.e.d.O(ZoomablePageViewState.e);
                break;
            default:
                this.e.d.O(ZoomablePageViewState.f);
                break;
        }
    }
}

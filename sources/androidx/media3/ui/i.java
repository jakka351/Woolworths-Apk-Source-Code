package androidx.media3.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3467a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i) {
        this.f3467a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height;
        int height2;
        switch (this.f3467a) {
            case 0:
                PlayerControlViewLayoutManager playerControlViewLayoutManager = (PlayerControlViewLayoutManager) this.b;
                PlayerControlView playerControlView = playerControlViewLayoutManager.f3457a;
                int width = (playerControlView.getWidth() - playerControlView.getPaddingLeft()) - playerControlView.getPaddingRight();
                int height3 = (playerControlView.getHeight() - playerControlView.getPaddingBottom()) - playerControlView.getPaddingTop();
                ViewGroup viewGroup = playerControlViewLayoutManager.c;
                int iC = PlayerControlViewLayoutManager.c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int iMax = Math.max(iC, PlayerControlViewLayoutManager.c(playerControlViewLayoutManager.i) + PlayerControlViewLayoutManager.c(playerControlViewLayoutManager.k));
                ViewGroup viewGroup2 = playerControlViewLayoutManager.d;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                boolean z = width <= iMax || height3 <= (height2 * 2) + paddingBottom;
                if (playerControlViewLayoutManager.A != z) {
                    playerControlViewLayoutManager.A = z;
                    view.post(new g(playerControlViewLayoutManager, 1));
                }
                boolean z2 = i3 - i != i7 - i5;
                if (!playerControlViewLayoutManager.A && z2) {
                    view.post(new g(playerControlViewLayoutManager, 2));
                    break;
                }
                break;
            default:
                PlayerControlView playerControlView2 = (PlayerControlView) this.b;
                int i9 = playerControlView2.o;
                PopupWindow popupWindow = playerControlView2.n;
                int i10 = i4 - i2;
                int i11 = i8 - i6;
                if ((i3 - i != i7 - i5 || i10 != i11) && popupWindow.isShowing()) {
                    playerControlView2.p();
                    popupWindow.update(view, (playerControlView2.getWidth() - popupWindow.getWidth()) - i9, (-popupWindow.getHeight()) - i9, -1, -1);
                    break;
                }
                break;
        }
    }
}

package androidx.cardview.widget;

import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;

@RequiresApi
/* loaded from: classes2.dex */
class CardViewApi21Impl implements CardViewImpl {
    public final void a(CardViewDelegate cardViewDelegate, float f) {
        RoundRectDrawable roundRectDrawable = (RoundRectDrawable) ((CardView.AnonymousClass1) cardViewDelegate).f666a;
        CardView cardView = CardView.this;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f != roundRectDrawable.e || roundRectDrawable.f != useCompatPadding || roundRectDrawable.g != preventCornerOverlap) {
            roundRectDrawable.e = f;
            roundRectDrawable.f = useCompatPadding;
            roundRectDrawable.g = preventCornerOverlap;
            roundRectDrawable.b(null);
            roundRectDrawable.invalidateSelf();
        }
        b(cardViewDelegate);
    }

    public final void b(CardViewDelegate cardViewDelegate) {
        if (!cardViewDelegate.a()) {
            cardViewDelegate.b(0, 0, 0, 0);
            return;
        }
        float f = ((RoundRectDrawable) cardViewDelegate.c()).e;
        float f2 = ((RoundRectDrawable) cardViewDelegate.c()).f667a;
        int iCeil = (int) Math.ceil(RoundRectDrawableWithShadow.a(f, f2, cardViewDelegate.d()));
        int iCeil2 = (int) Math.ceil(RoundRectDrawableWithShadow.b(f, f2, cardViewDelegate.d()));
        cardViewDelegate.b(iCeil, iCeil2, iCeil, iCeil2);
    }
}

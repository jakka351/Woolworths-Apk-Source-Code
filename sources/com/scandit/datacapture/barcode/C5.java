package com.scandit.datacapture.barcode;

import android.content.Context;
import android.text.StaticLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindItemContent;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class C5 extends FrameLayout {
    private static final Lazy g = LazyKt.b(C0944z5.f18285a);
    private static final Lazy h = LazyKt.b(A5.f17091a);
    private static final Lazy i = LazyKt.b(C0929y5.f18271a);
    public static final /* synthetic */ int j = 0;
    private final TextView b;
    private final TextView c;
    private final ImageView d;
    private final ImageView e;
    private int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5(Context context) {
        super(context);
        Intrinsics.h(context, "context");
        this.f = -1;
        LayoutInflater.from(getContext()).inflate(R.layout.sc_barcode_find_item_card, (ViewGroup) this, true);
        setBackgroundResource(R.drawable.sc_item_card_background);
        View viewFindViewById = findViewById(R.id.contentText);
        Intrinsics.g(viewFindViewById, "findViewById(R.id.contentText)");
        this.c = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.titleText);
        Intrinsics.g(viewFindViewById2, "findViewById<TextView?>(R.id.titleText)");
        TextView textView = (TextView) viewFindViewById2;
        this.b = textView;
        textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.scandit.datacapture.barcode.bf
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                C5.a(this.f17393a, view, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        });
        View viewFindViewById3 = findViewById(R.id.imageView);
        Intrinsics.g(viewFindViewById3, "findViewById(R.id.imageView)");
        this.d = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.itemFoundIcon);
        Intrinsics.g(viewFindViewById4, "findViewById(R.id.itemFoundIcon)");
        this.e = (ImageView) viewFindViewById4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C5 this$0, View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        Intrinsics.h(this$0, "this$0");
        if (this$0.b.getWidth() != this$0.f) {
            this$0.f = this$0.b.getWidth();
            this$0.a(this$0.c.getText());
        }
    }

    public final void a(C0914x5 c0914x5) {
        if (c0914x5 != null) {
            BarcodeFindItem barcodeFindItemA = c0914x5.a();
            boolean zB = c0914x5.b();
            BarcodeFindItemContent content = barcodeFindItemA.getContent();
            if ((content != null ? content.getInfo() : null) == null) {
                BarcodeFindItemContent content2 = barcodeFindItemA.getContent();
                if ((content2 != null ? content2.getAdditionalInfo() : null) == null) {
                    this.b.setText(barcodeFindItemA.getSearchOptions().getBarcodeData());
                } else {
                    this.b.setText(barcodeFindItemA.getContent().getAdditionalInfo());
                }
                a((CharSequence) null);
            } else {
                this.b.setText(barcodeFindItemA.getContent().getInfo());
                a(barcodeFindItemA.getContent().getAdditionalInfo());
            }
            BarcodeFindItemContent content3 = barcodeFindItemA.getContent();
            if ((content3 != null ? content3.getImage() : null) != null) {
                this.d.setImageBitmap(barcodeFindItemA.getContent().getImage());
                this.d.getLayoutParams().width = ((Number) i.getD()).intValue();
                this.d.getLayoutParams().height = ((Number) i.getD()).intValue();
            } else {
                this.d.setImageResource(R.drawable.sc_single_scan);
                this.d.getLayoutParams().width = -2;
                this.d.getLayoutParams().height = -2;
            }
            if (zB) {
                this.e.setVisibility(0);
            } else {
                this.e.setVisibility(4);
            }
        }
    }

    private final void a(CharSequence charSequence) {
        this.c.setText(charSequence);
        if (charSequence != null && charSequence.length() != 0) {
            this.c.setVisibility(0);
            TextView textView = this.c;
            TextView textView2 = this.b;
            StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(textView2.getText(), 0, textView2.getText().length(), textView2.getPaint(), textView2.getWidth()).build();
            Intrinsics.g(staticLayoutBuild, "obtain(\n            text…w.width\n        ).build()");
            textView.setMaxLines(staticLayoutBuild.getLineCount() <= 1 ? 2 : 1);
            return;
        }
        this.c.setVisibility(8);
    }
}

package com.salesforce.marketingcloud.messages.iam;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.Dimension;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.salesforce.marketingcloud.R;
import com.salesforce.marketingcloud.media.o;
import com.salesforce.marketingcloud.media.t;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private final View.OnClickListener f16999a;
    private final Typeface b;

    public class a implements Comparator<InAppMessage.Button> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(InAppMessage.Button button, InAppMessage.Button button2) {
            return button.index() - button2.index();
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f17001a;
        final /* synthetic */ int b;
        final /* synthetic */ View c;

        public b(View view, int i, View view2) {
            this.f17001a = view;
            this.b = i;
            this.c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Rect rect = new Rect();
            this.f17001a.getHitRect(rect);
            int i = rect.top;
            int i2 = this.b;
            rect.top = i - i2;
            rect.left -= i2;
            rect.bottom += i2;
            rect.right += i2;
            this.c.setTouchDelegate(new TouchDelegate(rect, this.f17001a));
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17002a;

        static {
            int[] iArr = new int[InAppMessage.Size.values().length];
            f17002a = iArr;
            try {
                iArr[InAppMessage.Size.l.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17002a[InAppMessage.Size.m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17002a[InAppMessage.Size.s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public d(View.OnClickListener onClickListener, @Nullable Typeface typeface) {
        this.f16999a = onClickListener;
        this.b = typeface;
    }

    private void a(ViewGroup viewGroup) {
        Space space = new Space(viewGroup.getContext());
        space.setLayoutParams(new LinearLayout.LayoutParams(Math.round(b(viewGroup.getResources())), -1));
        viewGroup.addView(space);
    }

    @Dimension
    public abstract float a(Resources resources);

    @Dimension
    public abstract float a(Resources resources, InAppMessage.Size size);

    @IdRes
    public abstract int a();

    @Dimension
    public abstract float b(Resources resources);

    @Dimension
    public abstract float b(Resources resources, InAppMessage.Size size);

    @IdRes
    public abstract int b();

    public void b(@NonNull View view, @NonNull k kVar) {
    }

    @Dimension
    public abstract float c(Resources resources);

    @Dimension
    public abstract float c(Resources resources, InAppMessage.Size size);

    @IdRes
    public abstract int c();

    @IdRes
    public abstract int d();

    @IdRes
    public abstract int e();

    @IdRes
    public abstract int f();

    @IdRes
    public abstract int g();

    @IdRes
    public abstract int h();

    private void a(View view, InAppMessage.TextField textField) {
        TextView textView = (TextView) view.findViewById(a());
        if (textView == null) {
            return;
        }
        if (!a(textField)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        Typeface typeface = this.b;
        if (typeface != null) {
            textView.setTypeface(typeface, 0);
        }
        g.a(textView, textField.text(), g.a(view.getContext(), textField.fontColor(), R.color.mcsdk_iam_default_font_color), a(view.getContext().getResources(), textField.fontSize()), g.a(textField.alignment()));
    }

    private void b(ViewGroup viewGroup) {
        Space space = new Space(viewGroup.getContext());
        space.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.round(c(viewGroup.getResources()))));
        viewGroup.addView(space);
    }

    private void a(View view) {
        if (view == null) {
            return;
        }
        View view2 = (View) view.getParent();
        view2.post(new b(view, Math.round(a(view.getContext().getResources())), view2));
    }

    private void b(View view, InAppMessage.TextField textField) {
        TextView textView = (TextView) view.findViewById(h());
        if (textView == null) {
            return;
        }
        if (!a(textField)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        Typeface typeface = this.b;
        if (typeface != null) {
            textView.setTypeface(typeface, 1);
        }
        g.a(textView, textField.text(), g.a(view.getContext(), textField.fontColor(), R.color.mcsdk_iam_default_font_color), c(view.getContext().getResources(), textField.fontSize()), g.a(textField.alignment()));
    }

    private void a(View view, o oVar, InAppMessage.Media media, InAppMessage.Type type) {
        ImageView imageView = (ImageView) view.findViewById(e());
        if (imageView == null) {
            return;
        }
        Context context = view.getContext();
        if (media == null) {
            View viewFindViewById = view.findViewById(d());
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
                return;
            } else {
                imageView.setVisibility(8);
                return;
            }
        }
        if (oVar != null) {
            imageView.setVisibility(0);
            t tVarD = oVar.b(media.url()).d();
            if (type == InAppMessage.Type.fullImageFill) {
                tVarD.b();
            } else {
                tVarD.a();
            }
            tVarD.a(b(context, media.cornerRadius()), a(context, media.borderWidth()), g.a(context, media.borderColor(), R.color.mcsdk_iam_default_border)).a(imageView);
        }
    }

    @Dimension
    private float b(Context context, InAppMessage.Size size) {
        if (size == null) {
            size = InAppMessage.Size.s;
        }
        Resources resources = context.getResources();
        int i = c.f17002a[size.ordinal()];
        return resources.getDimension(i != 1 ? i != 2 ? R.dimen.mcsdk_corner_radius_small : R.dimen.mcsdk_corner_radius_medium : R.dimen.mcsdk_corner_radius_large);
    }

    public void a(View view, String str, String str2, InAppMessage.Size size, InAppMessage.Size size2) {
        View viewFindViewById = view.findViewById(f());
        if (viewFindViewById == null) {
            return;
        }
        Context context = view.getContext();
        float fB = b(context, size2);
        float fA = a(context, size);
        Drawable drawableA = g.a(g.a(context, str, R.color.mcsdk_iam_default_message_background), fB, g.a(context, str2, R.color.mcsdk_iam_default_border), fA);
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        viewFindViewById.setBackground(drawableA);
        if (viewFindViewById instanceof ClippingConstraintLayout) {
            ((ClippingConstraintLayout) viewFindViewById).setClippingDetails(fA, fB);
        }
    }

    public void a(View view, @Nullable String str) {
        View viewFindViewById = view.findViewById(g());
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setBackgroundColor(g.a(view.getContext(), str, R.color.mcsdk_iam_default_window_background));
    }

    @Dimension
    private float a(Context context, InAppMessage.Size size) {
        if (size == null) {
            size = InAppMessage.Size.s;
        }
        Resources resources = context.getResources();
        int i = c.f17002a[size.ordinal()];
        return resources.getDimension(i != 1 ? i != 2 ? R.dimen.mcsdk_border_width_small : R.dimen.mcsdk_border_width_medium : R.dimen.mcsdk_border_width_large);
    }

    public void a(View view, k kVar) {
        if (kVar == null || view == null) {
            return;
        }
        InAppMessage inAppMessageD = kVar.d();
        a(view, inAppMessageD.windowColor());
        a(view, inAppMessageD.backgroundColor(), inAppMessageD.borderColor(), inAppMessageD.borderWidth(), inAppMessageD.cornerRadius());
        b(view, inAppMessageD.title());
        a(view, inAppMessageD.body());
        a(view, a(inAppMessageD) ? inAppMessageD.closeButton() : com.salesforce.marketingcloud.internal.a.a());
        List<InAppMessage.Button> listButtons = inAppMessageD.buttons();
        if (listButtons == null || listButtons.isEmpty()) {
            View viewFindViewById = view.findViewById(b());
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
        } else {
            ArrayList arrayList = new ArrayList(listButtons);
            Collections.sort(arrayList, new a());
            a(view, inAppMessageD.buttonConfiguration(), arrayList);
        }
        a(view, kVar.e(), inAppMessageD.media(), inAppMessageD.type());
        b(view, kVar);
    }

    private void a(View view, InAppMessage.CloseButton closeButton) {
        ImageButton imageButton = (ImageButton) view.findViewById(c());
        if (imageButton == null) {
            return;
        }
        if (closeButton == null) {
            imageButton.setVisibility(8);
            return;
        }
        ViewCompat.O(imageButton, 1.0f);
        imageButton.setVisibility(0);
        imageButton.setTag(closeButton);
        imageButton.setOnClickListener(this.f16999a);
        a(imageButton);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v8 */
    public void a(View view, InAppMessage.ButtonConfig buttonConfig, List<InAppMessage.Button> list) {
        int i;
        Context context = view.getContext();
        LinearLayout linearLayout = (LinearLayout) view.findViewById(b());
        ?? r6 = 0;
        if (buttonConfig == InAppMessage.ButtonConfig.stacked) {
            linearLayout.setOrientation(1);
            i = R.layout.mcsdk_iam_stacked_button;
        } else {
            linearLayout.setOrientation(0);
            i = R.layout.mcsdk_iam_sbs_button;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int size = list.size();
        int i2 = 0;
        while (i2 < 2 && i2 < size) {
            InAppMessage.Button button = list.get(i2);
            Button button2 = (Button) layoutInflaterFrom.inflate(i, linearLayout, (boolean) r6);
            Typeface typeface = this.b;
            if (typeface != null) {
                button2.setTypeface(typeface, r6);
            }
            g.a(button2, button.text(), g.a(context, button.fontColor(), R.color.mcsdk_iam_default_font_color), b(context.getResources(), button.fontSize()), g.a(InAppMessage.Alignment.center));
            Drawable drawableA = g.a(g.a(context, button.backgroundColor(), R.color.mcsdk_iam_default_btn_background), b(context, button.cornerRadius()), g.a(context, button.borderColor(), R.color.mcsdk_iam_default_border), a(context, button.borderWidth()));
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            button2.setBackground(drawableA);
            button2.setTag(button);
            button2.setOnClickListener(this.f16999a);
            linearLayout.addView(button2);
            if (i2 == 0 && size > 1) {
                if (buttonConfig == InAppMessage.ButtonConfig.stacked) {
                    b(linearLayout);
                } else {
                    a((ViewGroup) linearLayout);
                }
            }
            i2++;
            r6 = 0;
        }
    }

    public static boolean a(InAppMessage inAppMessage) {
        if ((inAppMessage.type() == InAppMessage.Type.full || inAppMessage.type() == InAppMessage.Type.modal) && inAppMessage.closeButton() == null) {
            return (inAppMessage.buttons() == null || inAppMessage.buttons().isEmpty()) ? false : true;
        }
        return true;
    }

    public static boolean a(InAppMessage.TextField textField) {
        return (textField == null || TextUtils.isEmpty(textField.text())) ? false : true;
    }
}

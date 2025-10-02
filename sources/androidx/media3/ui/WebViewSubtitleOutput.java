package androidx.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Util;
import androidx.media3.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.Output {
    public final CanvasSubtitleOutput d;
    public final WebView e;
    public List f;
    public CaptionStyleCompat g;
    public float h;
    public float i;

    /* renamed from: androidx.media3.ui.WebViewSubtitleOutput$1, reason: invalid class name */
    public class AnonymousClass1 extends WebView {
        @Override // android.webkit.WebView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            super.performClick();
            return false;
        }
    }

    /* renamed from: androidx.media3.ui.WebViewSubtitleOutput$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3466a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f3466a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3466a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3466a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context) {
        this(context, null);
    }

    @Override // androidx.media3.ui.SubtitleView.Output
    public final void a(List list, CaptionStyleCompat captionStyleCompat, float f, float f2) {
        this.g = captionStyleCompat;
        this.h = f;
        this.i = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Cue cue = (Cue) list.get(i);
            if (cue.d != null) {
                arrayList.add(cue);
            } else {
                arrayList2.add(cue);
            }
        }
        if (!this.f.isEmpty() || !arrayList2.isEmpty()) {
            this.f = arrayList2;
            c();
        }
        this.d.a(arrayList, captionStyleCompat, f, f2);
        invalidate();
    }

    public final String b(float f, int i) {
        float fB = SubtitleViewUtils.b(f, i, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fB == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fB / getContext().getResources().getDisplayMetrics().density)};
        int i2 = Util.f2928a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0520 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1769
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.WebViewSubtitleOutput.c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.f.isEmpty()) {
            return;
        }
        c();
    }

    public WebViewSubtitleOutput(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = Collections.EMPTY_LIST;
        this.g = CaptionStyleCompat.g;
        this.h = 0.0533f;
        this.i = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.d = canvasSubtitleOutput;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, attributeSet);
        this.e = anonymousClass1;
        anonymousClass1.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(anonymousClass1);
    }
}

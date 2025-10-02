package androidx.media3.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.LanguageFeatureSpan;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public final class SubtitleView extends FrameLayout {
    public List d;
    public CaptionStyleCompat e;
    public float f;
    public float g;
    public boolean h;
    public boolean i;
    public int j;
    public Output k;
    public View l;

    public interface Output {
        void a(List list, CaptionStyleCompat captionStyleCompat, float f, float f2);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewType {
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    private List<Cue> getCuesWithStylingPreferencesApplied() {
        if (this.h && this.i) {
            return this.d;
        }
        ArrayList arrayList = new ArrayList(this.d.size());
        for (int i = 0; i < this.d.size(); i++) {
            Cue.Builder builderA = ((Cue) this.d.get(i)).a();
            if (!this.h) {
                builderA.n = false;
                CharSequence charSequence = builderA.f2897a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        builderA.f2897a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = builderA.f2897a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof LanguageFeatureSpan)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                SubtitleViewUtils.a(builderA);
            } else if (!this.i) {
                SubtitleViewUtils.a(builderA);
            }
            arrayList.add(builderA.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private CaptionStyleCompat getUserCaptionStyle() {
        boolean zIsInEditMode = isInEditMode();
        CaptionStyleCompat captionStyleCompat = CaptionStyleCompat.g;
        if (zIsInEditMode) {
            return captionStyleCompat;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            captionStyleCompat = new CaptionStyleCompat(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return captionStyleCompat;
    }

    private <T extends View & Output> void setView(T t) {
        removeView(this.l);
        View view = this.l;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).e.destroy();
        }
        this.l = t;
        this.k = t;
        addView(t);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.k.a(getCuesWithStylingPreferencesApplied(), this.e, this.f, this.g);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.i = z;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.h = z;
        c();
    }

    public void setBottomPaddingFraction(float f) {
        this.g = f;
        c();
    }

    public void setCues(@Nullable List<Cue> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.d = list;
        c();
    }

    public void setFractionalTextSize(float f) {
        this.f = f;
        c();
    }

    public void setStyle(CaptionStyleCompat captionStyleCompat) {
        this.e = captionStyleCompat;
        c();
    }

    public void setViewType(int i) {
        if (this.j == i) {
            return;
        }
        if (i == 1) {
            setView(new CanvasSubtitleOutput(getContext()));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            setView(new WebViewSubtitleOutput(getContext()));
        }
        this.j = i;
    }

    public SubtitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = Collections.EMPTY_LIST;
        this.e = CaptionStyleCompat.g;
        this.f = 0.0533f;
        this.g = 0.08f;
        this.h = true;
        this.i = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context);
        this.k = canvasSubtitleOutput;
        this.l = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.j = 1;
    }
}

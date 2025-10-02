package androidx.media3.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.media3.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class CanvasSubtitleOutput extends View implements SubtitleView.Output {
    public final ArrayList d;
    public List e;
    public float f;
    public CaptionStyleCompat g;
    public float h;

    public CanvasSubtitleOutput(Context context) {
        this(context, null);
    }

    @Override // androidx.media3.ui.SubtitleView.Output
    public final void a(List list, CaptionStyleCompat captionStyleCompat, float f, float f2) {
        this.e = list;
        this.g = captionStyleCompat;
        this.f = f;
        this.h = f2;
        while (true) {
            ArrayList arrayList = this.d;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new SubtitlePainter(getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0467  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dispatchDraw(android.graphics.Canvas r37) {
        /*
            Method dump skipped, instructions count: 1174
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.CanvasSubtitleOutput.dispatchDraw(android.graphics.Canvas):void");
    }

    public CanvasSubtitleOutput(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new ArrayList();
        this.e = Collections.EMPTY_LIST;
        this.f = 0.0533f;
        this.g = CaptionStyleCompat.g;
        this.h = 0.08f;
    }
}

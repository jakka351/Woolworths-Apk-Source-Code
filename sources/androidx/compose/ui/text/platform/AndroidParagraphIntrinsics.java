package androidx.compose.ui.text.platform;

import android.text.Layout;
import android.text.TextPaint;
import androidx.browser.trusted.a;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.emoji2.text.EmojiCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidParagraphIntrinsics implements ParagraphIntrinsics {

    /* renamed from: a, reason: collision with root package name */
    public final String f2139a;
    public final TextStyle b;
    public final List c;
    public final List d;
    public final FontFamily.Resolver e;
    public final Density f;
    public final AndroidTextPaint g;
    public final CharSequence h;
    public final LayoutIntrinsics i;
    public TypefaceDirtyTrackerLinkedList j;
    public final boolean k;
    public final int l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x053a  */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.text.platform.AndroidParagraphIntrinsics, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v21, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AndroidParagraphIntrinsics(java.lang.String r43, androidx.compose.ui.text.TextStyle r44, java.util.List r45, java.util.List r46, androidx.compose.ui.text.font.FontFamily.Resolver r47, androidx.compose.ui.unit.Density r48) {
        /*
            Method dump skipped, instructions count: 1596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics.<init>(java.lang.String, androidx.compose.ui.text.TextStyle, java.util.List, java.util.List, androidx.compose.ui.text.font.FontFamily$Resolver, androidx.compose.ui.unit.Density):void");
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public final boolean a() {
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = this.j;
        if (typefaceDirtyTrackerLinkedList != null ? typefaceDirtyTrackerLinkedList.b() : false) {
            return true;
        }
        if (!this.k) {
            PlatformTextStyle platformTextStyle = this.b.platformStyle;
            EmojiCompatStatusDelegate emojiCompatStatusDelegate = EmojiCompatStatus.f2144a;
            DefaultImpl defaultImpl = (DefaultImpl) EmojiCompatStatus.f2144a;
            State stateA = defaultImpl.f2142a;
            if (stateA == null) {
                if (EmojiCompat.g()) {
                    stateA = defaultImpl.a();
                    defaultImpl.f2142a = stateA;
                } else {
                    stateA = EmojiCompatStatus_androidKt.f2145a;
                }
            }
            if (((Boolean) stateA.getD()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public final float b() {
        float f;
        LayoutIntrinsics layoutIntrinsics = this.i;
        float f2 = layoutIntrinsics.e;
        TextPaint textPaint = layoutIntrinsics.b;
        if (!Float.isNaN(f2)) {
            return layoutIntrinsics.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = layoutIntrinsics.f2075a;
        lineInstance.setText(new CharSequenceCharacterIterator(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, new a(2));
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.e).intValue() - ((Number) pair.d).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        if (priorityQueue.isEmpty()) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Pair pair2 = (Pair) it.next();
            float desiredWidth = Layout.getDesiredWidth(layoutIntrinsics.b(), ((Number) pair2.d).intValue(), ((Number) pair2.e).intValue(), textPaint);
            while (it.hasNext()) {
                Pair pair3 = (Pair) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(layoutIntrinsics.b(), ((Number) pair3.d).intValue(), ((Number) pair3.e).intValue(), textPaint));
            }
            f = desiredWidth;
        }
        layoutIntrinsics.e = f;
        return f;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public final float c() {
        return this.i.c();
    }
}

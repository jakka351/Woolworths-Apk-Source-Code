package androidx.media3.extractor.text.ttml;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.Subtitle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes2.dex */
final class TtmlSubtitle implements Subtitle {
    public final TtmlNode d;
    public final long[] e;
    public final Map f;
    public final HashMap g;
    public final HashMap h;

    public TtmlSubtitle(TtmlNode ttmlNode, HashMap map, HashMap map2, HashMap map3) {
        this.d = ttmlNode;
        this.g = map2;
        this.h = map3;
        this.f = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        ttmlNode.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.e = jArr;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final long a(int i) {
        return this.e[i];
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final int b() {
        return this.e.length;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final int c(long j) {
        long[] jArr = this.e;
        int iA = Util.a(jArr, j, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final List d(long j) {
        ArrayList arrayList = new ArrayList();
        TtmlNode ttmlNode = this.d;
        ttmlNode.g(j, ttmlNode.h, arrayList);
        TreeMap treeMap = new TreeMap();
        ttmlNode.i(j, false, ttmlNode.h, treeMap);
        String str = ttmlNode.h;
        Map map = this.f;
        HashMap map2 = this.g;
        ttmlNode.h(j, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str2 = (String) this.h.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                TtmlRegion ttmlRegion = (TtmlRegion) map2.get(pair.first);
                ttmlRegion.getClass();
                Cue.Builder builder = new Cue.Builder();
                builder.b = bitmapDecodeByteArray;
                builder.h = ttmlRegion.b;
                builder.i = 0;
                builder.e = ttmlRegion.c;
                builder.f = 0;
                builder.g = ttmlRegion.e;
                builder.l = ttmlRegion.f;
                builder.m = ttmlRegion.g;
                builder.p = ttmlRegion.j;
                arrayList2.add(builder.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            TtmlRegion ttmlRegion2 = (TtmlRegion) map2.get(entry.getKey());
            ttmlRegion2.getClass();
            Cue.Builder builder2 = (Cue.Builder) entry.getValue();
            CharSequence charSequence = builder2.f2897a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (DeleteTextSpan deleteTextSpan : (DeleteTextSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), DeleteTextSpan.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(deleteTextSpan), spannableStringBuilder.getSpanEnd(deleteTextSpan), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = ttmlRegion2.c;
            int i9 = ttmlRegion2.d;
            builder2.e = f;
            builder2.f = i9;
            builder2.g = ttmlRegion2.e;
            builder2.h = ttmlRegion2.b;
            builder2.l = ttmlRegion2.f;
            float f2 = ttmlRegion2.i;
            int i10 = ttmlRegion2.h;
            builder2.k = f2;
            builder2.j = i10;
            builder2.p = ttmlRegion2.j;
            arrayList2.add(builder2.a());
        }
        return arrayList2;
    }
}

package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.MetadataRepo;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import java.util.Iterator;
import java.util.Set;

@AnyThread
@RequiresApi
@RestrictTo
/* loaded from: classes2.dex */
final class EmojiProcessor {

    /* renamed from: a, reason: collision with root package name */
    public final EmojiCompat.SpanFactory f2704a;
    public final MetadataRepo b;
    public final EmojiCompat.GlyphChecker c;

    @RequiresApi
    public static final class CodepointIndexFinder {
    }

    public static class EmojiProcessAddSpanCallback implements EmojiProcessCallback<UnprecomputeTextOnModificationSpannable> {

        /* renamed from: a, reason: collision with root package name */
        public UnprecomputeTextOnModificationSpannable f2705a;
        public final EmojiCompat.SpanFactory b;

        public EmojiProcessAddSpanCallback(UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable, EmojiCompat.SpanFactory spanFactory) {
            this.f2705a = unprecomputeTextOnModificationSpannable;
            this.b = spanFactory;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public final boolean a(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if ((typefaceEmojiRasterizer.c & 4) > 0) {
                return true;
            }
            if (this.f2705a == null) {
                this.f2705a = new UnprecomputeTextOnModificationSpannable(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f2705a.setSpan(this.b.a(typefaceEmojiRasterizer), i, i2, 33);
            return true;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public final Object getResult() {
            return this.f2705a;
        }
    }

    public interface EmojiProcessCallback<T> {
        boolean a(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer);

        Object getResult();
    }

    public static class EmojiProcessLookupCallback implements EmojiProcessCallback<EmojiProcessLookupCallback> {

        /* renamed from: a, reason: collision with root package name */
        public final int f2706a;
        public int b = -1;
        public int c = -1;

        public EmojiProcessLookupCallback(int i) {
            this.f2706a = i;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public final boolean a(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            int i3 = this.f2706a;
            if (i > i3 || i3 >= i2) {
                return i2 <= i3;
            }
            this.b = i;
            this.c = i2;
            return false;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public final Object getResult() {
            return this;
        }
    }

    public static class MarkExclusionCallback implements EmojiProcessCallback<MarkExclusionCallback> {

        /* renamed from: a, reason: collision with root package name */
        public final String f2707a;

        public MarkExclusionCallback(String str) {
            this.f2707a = str;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public final boolean a(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f2707a)) {
                return true;
            }
            typefaceEmojiRasterizer.c = (typefaceEmojiRasterizer.c & 3) | 4;
            return false;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public final Object getResult() {
            return this;
        }
    }

    public static final class ProcessorSm {

        /* renamed from: a, reason: collision with root package name */
        public int f2708a = 1;
        public final MetadataRepo.Node b;
        public MetadataRepo.Node c;
        public MetadataRepo.Node d;
        public int e;
        public int f;

        public ProcessorSm(MetadataRepo.Node node) {
            this.b = node;
            this.c = node;
        }

        public final void a() {
            this.f2708a = 1;
            this.c = this.b;
            this.f = 0;
        }

        public final boolean b() {
            MetadataItem metadataItemB = this.c.b.b();
            int iA = metadataItemB.a(6);
            return !(iA == 0 || metadataItemB.b.get(iA + metadataItemB.f2719a) == 0) || this.e == 65039;
        }
    }

    public EmojiProcessor(MetadataRepo metadataRepo, EmojiCompat.DefaultSpanFactory defaultSpanFactory, EmojiCompat.GlyphChecker glyphChecker, Set set) {
        this.f2704a = defaultSpanFactory;
        this.b = metadataRepo;
        this.c = glyphChecker;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            h(str, 0, str.length(), 1, true, new MarkExclusionCallback(str));
        }
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        EmojiSpan[] emojiSpanArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, selectionEnd, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
                for (EmojiSpan emojiSpan : emojiSpanArr) {
                    int spanStart = editable.getSpanStart(emojiSpan);
                    int spanEnd = editable.getSpanEnd(emojiSpan);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.EmojiProcessor.d(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static boolean e(Editable editable, int i, KeyEvent keyEvent) {
        if (!(i != 67 ? i != 112 ? false : a(editable, keyEvent, true) : a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    public final int b(int i, CharSequence charSequence) {
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i, i + 1, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanEnd(emojiSpanArr[0]);
            }
        }
        return ((EmojiProcessLookupCallback) h(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(i))).c;
    }

    public final int c(int i, CharSequence charSequence) {
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i, i + 1, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanStart(emojiSpanArr[0]);
            }
        }
        return ((EmojiProcessLookupCallback) h(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(i))).b;
    }

    public final boolean f(CharSequence charSequence, int i, int i2, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        if ((typefaceEmojiRasterizer.c & 3) == 0) {
            EmojiCompat.GlyphChecker glyphChecker = this.c;
            MetadataItem metadataItemB = typefaceEmojiRasterizer.b();
            int iA = metadataItemB.a(8);
            if (iA != 0) {
                metadataItemB.b.getShort(iA + metadataItemB.f2719a);
            }
            boolean zA = glyphChecker.a(charSequence, i, i2);
            int i3 = typefaceEmojiRasterizer.c & 4;
            typefaceEmojiRasterizer.c = zA ? i3 | 2 : i3 | 1;
        }
        return (typefaceEmojiRasterizer.c & 3) == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046 A[Catch: all -> 0x0037, TRY_ENTER, TryCatch #1 {all -> 0x0037, blocks: (B:7:0x000f, B:10:0x0014, B:12:0x0018, B:14:0x0025, B:22:0x0046, B:24:0x0050, B:26:0x0053, B:28:0x0056, B:30:0x0066, B:31:0x0069), top: B:62:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:7:0x000f, B:10:0x0014, B:12:0x0018, B:14:0x0025, B:22:0x0046, B:24:0x0050, B:26:0x0053, B:28:0x0056, B:30:0x0066, B:31:0x0069), top: B:62:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078 A[Catch: all -> 0x00ac, TRY_ENTER, TryCatch #2 {all -> 0x00ac, blocks: (B:35:0x0078, B:38:0x0080, B:20:0x003c), top: B:64:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence g(java.lang.CharSequence r10, int r11, int r12, boolean r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 191
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.EmojiProcessor.g(java.lang.CharSequence, int, int, boolean):java.lang.CharSequence");
    }

    public final Object h(CharSequence charSequence, int i, int i2, int i3, boolean z, EmojiProcessCallback emojiProcessCallback) {
        int i4;
        char c;
        ProcessorSm processorSm = new ProcessorSm(this.b.c);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zA = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (iCharCount < i2 && i5 < i3 && zA) {
                SparseArray sparseArray = processorSm.c.f2712a;
                MetadataRepo.Node node = sparseArray == null ? null : (MetadataRepo.Node) sparseArray.get(iCodePointAt);
                if (processorSm.f2708a == 2) {
                    if (node != null) {
                        processorSm.c = node;
                        processorSm.f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            processorSm.a();
                        } else if (iCodePointAt != 65039) {
                            MetadataRepo.Node node2 = processorSm.c;
                            if (node2.b != null) {
                                if (processorSm.f != 1) {
                                    processorSm.d = node2;
                                    processorSm.a();
                                } else if (processorSm.b()) {
                                    processorSm.d = processorSm.c;
                                    processorSm.a();
                                } else {
                                    processorSm.a();
                                }
                                c = 3;
                            } else {
                                processorSm.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (node == null) {
                    processorSm.a();
                    c = 1;
                } else {
                    processorSm.f2708a = 2;
                    processorSm.c = node;
                    processorSm.f = 1;
                    c = 2;
                }
                processorSm.e = iCodePointAt;
                if (c == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (iCharCount < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c == 3) {
                    if (z || !f(charSequence, i4, iCharCount, processorSm.d.b)) {
                        zA = emojiProcessCallback.a(charSequence, i4, iCharCount, processorSm.d.b);
                        i5++;
                    }
                }
            }
            break loop0;
        }
        if (processorSm.f2708a == 2 && processorSm.c.b != null && ((processorSm.f > 1 || processorSm.b()) && i5 < i3 && zA && (z || !f(charSequence, i4, iCharCount, processorSm.c.b)))) {
            emojiProcessCallback.a(charSequence, i4, iCharCount, processorSm.c.b);
        }
        return emojiProcessCallback.getResult();
    }
}

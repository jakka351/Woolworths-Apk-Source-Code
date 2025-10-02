package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.ui.unit.IntRect;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-tooling-data_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SlotTreeKt {

    /* renamed from: a, reason: collision with root package name */
    public static final IntRect f2191a = new IntRect(0, 0, 0, 0);
    public static final Regex b = new Regex("(\\d+)|([,])|([*])|([:])|L|(P\\([^)]*\\))|(C(\\(([^)]*)\\))?)|@");
    public static final Regex c = new Regex("(\\d+)|,|[!P()]|:([^,!)]+)");

    public static final Field a(Class cls, String str) throws SecurityException {
        Field field;
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                field = null;
                break;
            }
            field = declaredFields[i];
            if (Intrinsics.c(field.getName(), str)) {
                break;
            }
            i++;
        }
        if (field == null) {
            return null;
        }
        field.setAccessible(true);
        return field;
    }

    public static final Group b(CompositionData compositionData) {
        CompositionGroup compositionGroup = (CompositionGroup) CollectionsKt.E(compositionData.getI());
        return compositionGroup != null ? c(compositionGroup, null) : EmptyGroup.h;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public static final androidx.compose.ui.tooling.data.Group c(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r34v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    public static final void d(Ref.IntRef intRef, ArrayList arrayList, int i) {
        int i2 = i - intRef.d;
        if (i2 > 0) {
            if (i2 < 4) {
                i2 = 4;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(Integer.valueOf(intRef.d + i3 + 1));
            }
            intRef.d += i2;
        }
    }

    public static final void e(String str, Ref.ObjectRef objectRef) throws ParseError {
        MatchResult matchResult = (MatchResult) objectRef.d;
        if (matchResult == null || !Intrinsics.c((String) matchResult.c().get(0), str)) {
            throw new ParseError();
        }
        i(objectRef);
    }

    public static final String f(Ref.ObjectRef objectRef) throws ParseError {
        MatchResult matchResult = (MatchResult) objectRef.d;
        if (matchResult == null || matchResult.getC().d(2) == null) {
            throw new ParseError();
        }
        i(objectRef);
        String strSubstring = ((String) matchResult.c().get(0)).substring(1);
        Intrinsics.g(strSubstring, "substring(...)");
        if (!StringsKt.W(strSubstring, "c#", false)) {
            return strSubstring;
        }
        String strSubstring2 = strSubstring.substring(2);
        Intrinsics.g(strSubstring2, "substring(...)");
        return "androidx.compose.".concat(strSubstring2);
    }

    public static final int g(Ref.ObjectRef objectRef) throws ParseError {
        MatchResult matchResult = (MatchResult) objectRef.d;
        if (matchResult == null || matchResult.getC().d(1) == null) {
            throw new ParseError();
        }
        i(objectRef);
        try {
            return Integer.parseInt((String) matchResult.c().get(0));
        } catch (NumberFormatException unused) {
            throw new ParseError();
        }
    }

    public static final boolean h(String str, Ref.ObjectRef objectRef) {
        MatchResult matchResult = (MatchResult) objectRef.d;
        return matchResult == null || Intrinsics.c((String) matchResult.c().get(0), str);
    }

    public static final void i(Ref.ObjectRef objectRef) {
        MatchResult matchResult = (MatchResult) objectRef.d;
        if (matchResult != null) {
            objectRef.d = matchResult.next();
        }
    }

    public static final MatchResult j(Ref.ObjectRef objectRef) {
        MatchResult matchResult = (MatchResult) objectRef.d;
        if (matchResult != null) {
            objectRef.d = matchResult.next();
        }
        return (MatchResult) objectRef.d;
    }
}

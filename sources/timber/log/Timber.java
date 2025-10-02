package timber.log;

import android.util.Log;
import io.jsonwebtoken.JwtParser;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltimber/log/Timber;", "", "DebugTree", "Forest", "Tree", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class Timber {

    /* renamed from: a, reason: collision with root package name */
    public static final Forest f27013a = new Forest();
    public static final ArrayList b = new ArrayList();
    public static volatile Tree[] c = new Tree[0];

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ltimber/log/Timber$DebugTree;", "Ltimber/log/Timber$Tree;", "Companion", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes8.dex */
    public static class DebugTree extends Tree {
        public static final Pattern c = Pattern.compile("(\\$\\d+)+$");
        public final List b = CollectionsKt.R(Timber.class.getName(), Forest.class.getName(), Tree.class.getName(), DebugTree.class.getName());

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Ltimber/log/Timber$DebugTree$Companion;", "", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "ANONYMOUS_CLASS", "Ljava/util/regex/Pattern;", "", "MAX_LOG_LENGTH", "I", "MAX_TAG_LENGTH", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
        }

        @Override // timber.log.Timber.Tree
        public final String g() {
            String strG = super.g();
            if (strG != null) {
                return strG;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.g(stackTrace, "Throwable().stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (!this.b.contains(stackTraceElement.getClassName())) {
                    String className = stackTraceElement.getClassName();
                    Intrinsics.g(className, "element.className");
                    String strA0 = StringsKt.a0(JwtParser.SEPARATOR_CHAR, className, className);
                    Matcher matcher = c.matcher(strA0);
                    if (!matcher.find()) {
                        return strA0;
                    }
                    String strReplaceAll = matcher.replaceAll("");
                    Intrinsics.g(strReplaceAll, "m.replaceAll(\"\")");
                    return strReplaceAll;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        @Override // timber.log.Timber.Tree
        public final void j(int i, String str, String message, Throwable th) {
            int iMin;
            Intrinsics.h(message, "message");
            if (message.length() < 4000) {
                if (i == 7) {
                    Log.wtf(str, message);
                    return;
                } else {
                    Log.println(i, str, message);
                    return;
                }
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int iB = StringsKt.B(message, '\n', i2, 4);
                if (iB == -1) {
                    iB = length;
                }
                while (true) {
                    iMin = Math.min(iB, i2 + 4000);
                    String strSubstring = message.substring(i2, iMin);
                    Intrinsics.g(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (i == 7) {
                        Log.wtf(str, strSubstring);
                    } else {
                        Log.println(i, str, strSubstring);
                    }
                    if (iMin >= iB) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltimber/log/Timber$Forest;", "Ltimber/log/Timber$Tree;", "", "treeArray", "[Ltimber/log/Timber$Tree;", "Ljava/util/ArrayList;", "trees", "Ljava/util/ArrayList;", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Forest extends Tree {
        @Override // timber.log.Timber.Tree
        public final void a(String str, Throwable th, Object... args) {
            Intrinsics.h(args, "args");
            for (Tree tree : Timber.c) {
                tree.a(str, th, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public final void b(String str, Object... args) {
            Intrinsics.h(args, "args");
            for (Tree tree : Timber.c) {
                tree.b(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public final void c(Throwable th) {
            for (Tree tree : Timber.c) {
                tree.c(th);
            }
        }

        @Override // timber.log.Timber.Tree
        public final void d(String str, Throwable th, Object... args) {
            Intrinsics.h(args, "args");
            for (Tree tree : Timber.c) {
                tree.d(str, th, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public final void e(String str, Object... args) {
            Intrinsics.h(args, "args");
            for (Tree tree : Timber.c) {
                tree.e(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public final void f(Throwable th) {
            for (Tree tree : Timber.c) {
                tree.f(th);
            }
        }

        @Override // timber.log.Timber.Tree
        public final void h(String str, Object... args) {
            Intrinsics.h(args, "args");
            for (Tree tree : Timber.c) {
                tree.h(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public final void j(int i, String str, String message, Throwable th) {
            Intrinsics.h(message, "message");
            throw new AssertionError();
        }

        @Override // timber.log.Timber.Tree
        public final void l(String str, Throwable th, Object... args) {
            Intrinsics.h(args, "args");
            for (Tree tree : Timber.c) {
                tree.l(str, th, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public final void m(String str, Object... args) {
            Intrinsics.h(args, "args");
            for (Tree tree : Timber.c) {
                tree.m(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public final void n(String str, Throwable th, Object... args) {
            Intrinsics.h(args, "args");
            for (Tree tree : Timber.c) {
                tree.n(str, th, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public final void o(String str, Object... args) {
            Intrinsics.h(args, "args");
            for (Tree tree : Timber.c) {
                tree.o(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public final void p(Throwable th) {
            for (Tree tree : Timber.c) {
                tree.p(th);
            }
        }

        @Override // timber.log.Timber.Tree
        public final void q(String str, Object... args) {
            Intrinsics.h(args, "args");
            for (Tree tree : Timber.c) {
                tree.q(str, Arrays.copyOf(args, args.length));
            }
        }

        public final void r(Tree tree) {
            if (tree == this) {
                throw new IllegalArgumentException("Cannot plant Timber into itself.");
            }
            ArrayList arrayList = Timber.b;
            synchronized (arrayList) {
                arrayList.add(tree);
                Object[] array = arrayList.toArray(new Tree[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                Timber.c = (Tree[]) array;
            }
        }

        public final void s(String str) {
            Tree[] treeArr = Timber.c;
            int length = treeArr.length;
            int i = 0;
            while (i < length) {
                Tree tree = treeArr[i];
                i++;
                tree.f27014a.set(str);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltimber/log/Timber$Tree;", "", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class Tree {

        /* renamed from: a, reason: collision with root package name */
        public final ThreadLocal f27014a = new ThreadLocal();

        public void a(String str, Throwable th, Object... args) {
            Intrinsics.h(args, "args");
            k(3, th, str, Arrays.copyOf(args, args.length));
        }

        public void b(String str, Object... args) {
            Intrinsics.h(args, "args");
            k(3, null, str, Arrays.copyOf(args, args.length));
        }

        public void c(Throwable th) {
            k(3, th, null, new Object[0]);
        }

        public void d(String str, Throwable th, Object... args) {
            Intrinsics.h(args, "args");
            k(6, th, str, Arrays.copyOf(args, args.length));
        }

        public void e(String str, Object... args) {
            Intrinsics.h(args, "args");
            k(6, null, str, Arrays.copyOf(args, args.length));
        }

        public void f(Throwable th) {
            k(6, th, null, new Object[0]);
        }

        public /* synthetic */ String g() {
            ThreadLocal threadLocal = this.f27014a;
            String str = (String) threadLocal.get();
            if (str != null) {
                threadLocal.remove();
            }
            return str;
        }

        public void h(String str, Object... args) {
            Intrinsics.h(args, "args");
            k(4, null, str, Arrays.copyOf(args, args.length));
        }

        public boolean i(int i, String str) {
            return true;
        }

        public abstract void j(int i, String str, String str2, Throwable th);

        public final void k(int i, Throwable th, String str, Object... objArr) {
            String strG = g();
            if (i(i, strG)) {
                if (str != null && str.length() != 0) {
                    if (objArr.length != 0) {
                        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                        str = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                    }
                    if (th != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append((Object) str);
                        sb.append('\n');
                        StringWriter stringWriter = new StringWriter(256);
                        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                        th.printStackTrace(printWriter);
                        printWriter.flush();
                        String string = stringWriter.toString();
                        Intrinsics.g(string, "sw.toString()");
                        sb.append(string);
                        str = sb.toString();
                    }
                } else {
                    if (th == null) {
                        return;
                    }
                    StringWriter stringWriter2 = new StringWriter(256);
                    PrintWriter printWriter2 = new PrintWriter((Writer) stringWriter2, false);
                    th.printStackTrace(printWriter2);
                    printWriter2.flush();
                    str = stringWriter2.toString();
                    Intrinsics.g(str, "sw.toString()");
                }
                j(i, strG, str, th);
            }
        }

        public void l(String str, Throwable th, Object... args) {
            Intrinsics.h(args, "args");
            k(2, th, str, Arrays.copyOf(args, args.length));
        }

        public void m(String str, Object... args) {
            Intrinsics.h(args, "args");
            k(2, null, str, Arrays.copyOf(args, args.length));
        }

        public void n(String str, Throwable th, Object... args) {
            Intrinsics.h(args, "args");
            k(5, th, str, Arrays.copyOf(args, args.length));
        }

        public void o(String str, Object... args) {
            Intrinsics.h(args, "args");
            k(5, null, str, Arrays.copyOf(args, args.length));
        }

        public void p(Throwable th) {
            k(5, th, null, new Object[0]);
        }

        public void q(String str, Object... args) {
            Intrinsics.h(args, "args");
            k(7, null, str, Arrays.copyOf(args, args.length));
        }
    }

    public static final void a() {
        f27013a.s("SwrveSDK");
    }

    public static void b(Throwable th) {
        f27013a.p(th);
    }
}

package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class GlideException extends Exception {
    public static final StackTraceElement[] i = new StackTraceElement[0];
    public final List d;
    public Key e;
    public DataSource f;
    public Class g;
    public final String h;

    public GlideException(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (!(th instanceof GlideException)) {
            arrayList.add(th);
            return;
        }
        Iterator it = ((GlideException) th).d.iterator();
        while (it.hasNext()) {
            a((Throwable) it.next(), arrayList);
        }
    }

    public static void b(List list, Appendable appendable) throws IOException {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            IndentedAppendable indentedAppendable = (IndentedAppendable) appendable;
            indentedAppendable.append("Cause (");
            int i3 = i2 + 1;
            indentedAppendable.append(String.valueOf(i3));
            indentedAppendable.append(" of ");
            indentedAppendable.append(String.valueOf(size));
            indentedAppendable.append("): ");
            Throwable th = (Throwable) list.get(i2);
            if (th instanceof GlideException) {
                ((GlideException) th).e(indentedAppendable);
            } else {
                c(th, indentedAppendable);
            }
            i2 = i3;
        }
    }

    public static void c(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i3 = i2 + 1;
            sb.append(i3);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i2));
            i2 = i3;
        }
    }

    public final void e(Appendable appendable) throws IOException {
        c(this, appendable);
        try {
            b(this.d, new IndentedAppendable(appendable));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.h);
        String str3 = "";
        if (this.g != null) {
            str = ", " + this.g;
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f != null) {
            str2 = ", " + this.f;
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (this.e != null) {
            str3 = ", " + this.e;
        }
        sb.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() throws IOException {
        e(System.err);
    }

    public GlideException(String str, List list) {
        this.h = str;
        setStackTrace(i);
        this.d = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) throws IOException {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) throws IOException {
        e(printWriter);
    }

    /* loaded from: classes4.dex */
    public static final class IndentedAppendable implements Appendable {
        public final Appendable d;
        public boolean e = true;

        public IndentedAppendable(Appendable appendable) {
            this.d = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c) throws IOException {
            boolean z = this.e;
            Appendable appendable = this.d;
            if (z) {
                this.e = false;
                appendable.append("  ");
            }
            this.e = c == '\n';
            appendable.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = this.e;
            Appendable appendable = this.d;
            boolean z2 = false;
            if (z) {
                this.e = false;
                appendable.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
                z2 = true;
            }
            this.e = z2;
            appendable.append(charSequence, i, i2);
            return this;
        }
    }
}

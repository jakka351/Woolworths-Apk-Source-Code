package androidx.room.util;

import YU.a;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.b;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import com.google.android.gms.ads.AdError;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Landroidx/room/util/TableInfo;", "", "Column", "Companion", "CreatedFrom", "ForeignKey", "ForeignKeyWithSequence", "Index", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes2.dex */
public final class TableInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f3726a;
    public final Object b;
    public final Set c;
    public final Set d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/util/TableInfo$Column;", "", "Companion", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Column {

        /* renamed from: a, reason: collision with root package name */
        public final String f3727a;
        public final String b;
        public final boolean c;
        public final int d;
        public final String e;
        public final int f;
        public final int g;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/util/TableInfo$Column$Companion;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            public static boolean a(String current, String str) {
                Intrinsics.h(current, "current");
                if (current.equals(str)) {
                    return true;
                }
                if (current.length() != 0) {
                    int i = 0;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i < current.length()) {
                            char cCharAt = current.charAt(i);
                            int i4 = i3 + 1;
                            if (i3 == 0 && cCharAt != '(') {
                                break;
                            }
                            if (cCharAt != '(') {
                                if (cCharAt == ')' && i2 - 1 == 0 && i3 != current.length() - 1) {
                                    break;
                                }
                            } else {
                                i2++;
                            }
                            i++;
                            i3 = i4;
                        } else if (i2 == 0) {
                            String strSubstring = current.substring(1, current.length() - 1);
                            Intrinsics.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                            return Intrinsics.c(StringsKt.k0(strSubstring).toString(), str);
                        }
                    }
                }
                return false;
            }
        }

        public Column(int i, String str, String str2, String str3, boolean z, int i2) {
            this.f3727a = str;
            this.b = str2;
            this.c = z;
            this.d = i;
            this.e = str3;
            this.f = i2;
            Locale US = Locale.US;
            Intrinsics.g(US, "US");
            String upperCase = str2.toUpperCase(US);
            Intrinsics.g(upperCase, "this as java.lang.String).toUpperCase(locale)");
            this.g = StringsKt.o(upperCase, "INT", false) ? 3 : (StringsKt.o(upperCase, "CHAR", false) || StringsKt.o(upperCase, "CLOB", false) || StringsKt.o(upperCase, "TEXT", false)) ? 2 : StringsKt.o(upperCase, "BLOB", false) ? 5 : (StringsKt.o(upperCase, "REAL", false) || StringsKt.o(upperCase, "FLOA", false) || StringsKt.o(upperCase, "DOUB", false)) ? 4 : 1;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof Column)) {
                    return false;
                }
                Column column = (Column) obj;
                if (this.d != column.d) {
                    return false;
                }
                int i = column.f;
                String str = column.e;
                if (!this.f3727a.equals(column.f3727a) || this.c != column.c) {
                    return false;
                }
                String str2 = this.e;
                int i2 = this.f;
                if (i2 == 1 && i == 2 && str2 != null && !Companion.a(str2, str)) {
                    return false;
                }
                if (i2 == 2 && i == 1 && str != null && !Companion.a(str, str2)) {
                    return false;
                }
                if (i2 != 0 && i2 == i) {
                    if (str2 != null) {
                        if (!Companion.a(str2, str)) {
                            return false;
                        }
                    } else if (str != null) {
                        return false;
                    }
                }
                if (this.g != column.g) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            return (((((this.f3727a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Column{name='");
            sb.append(this.f3727a);
            sb.append("', type='");
            sb.append(this.b);
            sb.append("', affinity='");
            sb.append(this.g);
            sb.append("', notNull=");
            sb.append(this.c);
            sb.append(", primaryKeyPosition=");
            sb.append(this.d);
            sb.append(", defaultValue='");
            String str = this.e;
            if (str == null) {
                str = AdError.UNDEFINED_DOMAIN;
            }
            return a.o(sb, str, "'}");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/room/util/TableInfo$Companion;", "", "", "CREATED_FROM_DATABASE", "I", "CREATED_FROM_ENTITY", "CREATED_FROM_UNKNOWN", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Code restructure failed: missing block: B:64:0x01e0, code lost:
        
            r9 = kotlin.collections.SetsKt.a(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x01e4, code lost:
        
            r3.close();
         */
        /* JADX WARN: Finally extract failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static androidx.room.util.TableInfo a(androidx.sqlite.db.framework.FrameworkSQLiteDatabase r26, java.lang.String r27) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 515
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.TableInfo.Companion.a(androidx.sqlite.db.framework.FrameworkSQLiteDatabase, java.lang.String):androidx.room.util.TableInfo");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/room/util/TableInfo$CreatedFrom;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface CreatedFrom {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/util/TableInfo$ForeignKey;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo
    public static final class ForeignKey {

        /* renamed from: a, reason: collision with root package name */
        public final String f3728a;
        public final String b;
        public final String c;
        public final List d;
        public final List e;

        public ForeignKey(String str, String str2, String str3, List columnNames, List referenceColumnNames) {
            Intrinsics.h(columnNames, "columnNames");
            Intrinsics.h(referenceColumnNames, "referenceColumnNames");
            this.f3728a = str;
            this.b = str2;
            this.c = str3;
            this.d = columnNames;
            this.e = referenceColumnNames;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForeignKey)) {
                return false;
            }
            ForeignKey foreignKey = (ForeignKey) obj;
            if (Intrinsics.c(this.f3728a, foreignKey.f3728a) && Intrinsics.c(this.b, foreignKey.b) && Intrinsics.c(this.c, foreignKey.c) && Intrinsics.c(this.d, foreignKey.d)) {
                return Intrinsics.c(this.e, foreignKey.e);
            }
            return false;
        }

        public final int hashCode() {
            return this.e.hashCode() + b.d(b.c(b.c(this.f3728a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ForeignKey{referenceTable='");
            sb.append(this.f3728a);
            sb.append("', onDelete='");
            sb.append(this.b);
            sb.append(" +', onUpdate='");
            sb.append(this.c);
            sb.append("', columnNames=");
            sb.append(this.d);
            sb.append(", referenceColumnNames=");
            return androidx.compose.ui.input.pointer.a.o(sb, this.e, '}');
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/util/TableInfo$ForeignKeyWithSequence;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ForeignKeyWithSequence implements Comparable<ForeignKeyWithSequence> {
        public final int d;
        public final int e;
        public final String f;
        public final String g;

        public ForeignKeyWithSequence(int i, int i2, String str, String str2) {
            this.d = i;
            this.e = i2;
            this.f = str;
            this.g = str2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(ForeignKeyWithSequence foreignKeyWithSequence) {
            ForeignKeyWithSequence other = foreignKeyWithSequence;
            Intrinsics.h(other, "other");
            int i = this.d - other.d;
            return i == 0 ? this.e - other.e : i;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/util/TableInfo$Index;", "", "Companion", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RestrictTo
    @SourceDebugExtension
    public static final class Index {

        /* renamed from: a, reason: collision with root package name */
        public final String f3729a;
        public final boolean b;
        public final List c;
        public final List d;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/util/TableInfo$Index$Companion;", "", "", "DEFAULT_PREFIX", "Ljava/lang/String;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public Index(String str, boolean z, List columns, List orders) {
            Intrinsics.h(columns, "columns");
            Intrinsics.h(orders, "orders");
            this.f3729a = str;
            this.b = z;
            this.c = columns;
            this.d = orders;
            List arrayList = orders;
            if (arrayList.isEmpty()) {
                int size = columns.size();
                arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add("ASC");
                }
            }
            this.d = (List) arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Index) {
                Index index = (Index) obj;
                String str = index.f3729a;
                if (this.b == index.b && Intrinsics.c(this.c, index.c) && Intrinsics.c(this.d, index.d)) {
                    String str2 = this.f3729a;
                    return StringsKt.W(str2, "index_", false) ? StringsKt.W(str, "index_", false) : str2.equals(str);
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f3729a;
            return this.d.hashCode() + b.d((((StringsKt.W(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Index{name='");
            sb.append(this.f3729a);
            sb.append("', unique=");
            sb.append(this.b);
            sb.append(", columns=");
            sb.append(this.c);
            sb.append(", orders=");
            return android.support.v4.media.session.a.t(sb, this.d, "'}");
        }
    }

    public TableInfo(String str, Map map, AbstractSet foreignKeys, AbstractSet abstractSet) {
        Intrinsics.h(foreignKeys, "foreignKeys");
        this.f3726a = str;
        this.b = map;
        this.c = foreignKeys;
        this.d = abstractSet;
    }

    public static final TableInfo a(FrameworkSQLiteDatabase frameworkSQLiteDatabase, String str) {
        return Companion.a(frameworkSQLiteDatabase, str);
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo)) {
            return false;
        }
        TableInfo tableInfo = (TableInfo) obj;
        if (!this.f3726a.equals(tableInfo.f3726a) || !this.b.equals(tableInfo.b) || !Intrinsics.c(this.c, tableInfo.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = tableInfo.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.c.hashCode() + android.support.v4.media.session.a.e(this.f3726a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f3726a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}

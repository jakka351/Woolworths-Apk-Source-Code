package com.google.gson.internal.bind;

import YU.a;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.JavaVersion;
import com.google.gson.internal.PreJava9DateFormatProvider;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    public final DateType f15941a;
    public final ArrayList b;

    public static abstract class DateType<T extends Date> {
        public static final DateType b = new AnonymousClass1(Date.class);

        /* renamed from: a, reason: collision with root package name */
        public final Class f15942a;

        /* renamed from: com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType$1, reason: invalid class name */
        public class AnonymousClass1 extends DateType<Date> {
            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType
            public final Date c(Date date) {
                return date;
            }
        }

        public DateType(Class cls) {
            this.f15942a = cls;
        }

        public final TypeAdapterFactory a(int i, int i2) {
            DefaultDateTypeAdapter defaultDateTypeAdapter = new DefaultDateTypeAdapter(this, i, i2);
            TypeAdapterFactory typeAdapterFactory = TypeAdapters.f15954a;
            return new TypeAdapters.AnonymousClass31(this.f15942a, defaultDateTypeAdapter);
        }

        public final TypeAdapterFactory b(String str) {
            DefaultDateTypeAdapter defaultDateTypeAdapter = new DefaultDateTypeAdapter(this, str);
            TypeAdapterFactory typeAdapterFactory = TypeAdapters.f15954a;
            return new TypeAdapters.AnonymousClass31(this.f15942a, defaultDateTypeAdapter);
        }

        public abstract Date c(Date date);
    }

    public DefaultDateTypeAdapter(DateType dateType, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Objects.requireNonNull(dateType);
        this.f15941a = dateType;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (JavaVersion.a()) {
            arrayList.add(PreJava9DateFormatProvider.a(i, i2));
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        Date dateB;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        synchronized (this.b) {
            try {
                Iterator it = this.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            dateB = ISO8601Utils.b(strNextString, new ParsePosition(0));
                            break;
                        } catch (ParseException e) {
                            StringBuilder sbU = a.u("Failed parsing '", strNextString, "' as Date; at path ");
                            sbU.append(jsonReader.getPreviousPath());
                            throw new JsonSyntaxException(sbU.toString(), e);
                        }
                    }
                    try {
                        dateB = ((DateFormat) it.next()).parse(strNextString);
                    } catch (ParseException unused) {
                    }
                }
            } finally {
            }
        }
        return this.f15941a.c(dateB);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        synchronized (this.b) {
            str = dateFormat.format(date);
        }
        jsonWriter.value(str);
    }

    public DefaultDateTypeAdapter(DateType dateType, String str) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Objects.requireNonNull(dateType);
        this.f15941a = dateType;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }
}

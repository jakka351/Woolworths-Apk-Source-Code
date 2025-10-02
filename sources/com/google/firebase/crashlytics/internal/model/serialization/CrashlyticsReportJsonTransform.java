package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class CrashlyticsReportJsonTransform {

    /* renamed from: a, reason: collision with root package name */
    public static final DataEncoder f15383a;

    /* loaded from: classes6.dex */
    public interface ObjectParser<T> {
        Object a(JsonReader jsonReader);
    }

    static {
        JsonDataEncoderBuilder jsonDataEncoderBuilder = new JsonDataEncoderBuilder();
        AutoCrashlyticsReportEncoder.f15302a.configure(jsonDataEncoderBuilder);
        jsonDataEncoderBuilder.d = true;
        f15383a = jsonDataEncoderBuilder.a();
    }

    public static CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame a(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builderA = CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    builderA.d(jsonReader.nextLong());
                    break;
                case "symbol":
                    builderA.f(jsonReader.nextString());
                    break;
                case "pc":
                    builderA.e(jsonReader.nextLong());
                    break;
                case "file":
                    builderA.b(jsonReader.nextString());
                    break;
                case "importance":
                    builderA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builderA.a();
    }

    public static CrashlyticsReport.CustomAttribute b(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.CustomAttribute.Builder builderA = CrashlyticsReport.CustomAttribute.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                builderA.b(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                builderA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return builderA.a();
    }

    public static CrashlyticsReport.ApplicationExitInfo c(JsonReader jsonReader) throws IOException {
        int i;
        CrashlyticsReport.ApplicationExitInfo.Builder builderA = CrashlyticsReport.ApplicationExitInfo.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            i = 0;
            switch (strNextName) {
                case "buildIdMappingForArch":
                    builderA.b(d(jsonReader, new a(i)));
                    break;
                case "pid":
                    builderA.d(jsonReader.nextInt());
                    break;
                case "pss":
                    builderA.f(jsonReader.nextLong());
                    break;
                case "rss":
                    builderA.h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    builderA.i(jsonReader.nextLong());
                    break;
                case "processName":
                    builderA.e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    builderA.g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    builderA.j(jsonReader.nextString());
                    break;
                case "importance":
                    builderA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builderA.a();
    }

    public static List d(JsonReader jsonReader, ObjectParser objectParser) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(objectParser.a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event e(android.util.JsonReader r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.e(android.util.JsonReader):com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event");
    }

    public static CrashlyticsReport.Session.Event.Application.Execution.Exception f(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder builderA = CrashlyticsReport.Session.Event.Application.Execution.Exception.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    builderA.c(d(jsonReader, new a(6)));
                    break;
                case "reason":
                    builderA.e(jsonReader.nextString());
                    break;
                case "type":
                    builderA.f(jsonReader.nextString());
                    break;
                case "causedBy":
                    builderA.b(f(jsonReader));
                    break;
                case "overflowCount":
                    builderA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builderA.a();
    }

    public static CrashlyticsReport.Session.Event.Application.ProcessDetails g(JsonReader jsonReader) throws IOException {
        CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder builderA = CrashlyticsReport.Session.Event.Application.ProcessDetails.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    builderA.d(jsonReader.nextInt());
                    break;
                case "processName":
                    builderA.e(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    builderA.b(jsonReader.nextBoolean());
                    break;
                case "importance":
                    builderA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builderA.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport h(android.util.JsonReader r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.h(android.util.JsonReader):com.google.firebase.crashlytics.internal.model.CrashlyticsReport");
    }

    public static CrashlyticsReport i(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                CrashlyticsReport crashlyticsReportH = h(jsonReader);
                jsonReader.close();
                return crashlyticsReportH;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}

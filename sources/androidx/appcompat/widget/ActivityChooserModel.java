package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
class ActivityChooserModel extends DataSetObservable {
    public static final Object j = new Object();
    public static final HashMap k = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Object f143a = new Object();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final Context d;
    public final String e;
    public final ActivitySorter f;
    public final int g;
    public boolean h;
    public boolean i;

    public interface ActivityChooserModelClient {
    }

    public static final class ActivityResolveInfo implements Comparable<ActivityResolveInfo> {
        @Override // java.lang.Comparable
        public final int compareTo(ActivityResolveInfo activityResolveInfo) {
            activityResolveInfo.getClass();
            return Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED) - Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ActivityResolveInfo.class != obj.getClass()) {
                return false;
            }
            return Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED) == Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED);
        }

        public final int hashCode() {
            return Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED) + 31;
        }

        public final String toString() {
            throw null;
        }
    }

    public interface ActivitySorter {
    }

    public static final class DefaultSorter implements ActivitySorter {
    }

    public static final class HistoricalRecord {

        /* renamed from: a, reason: collision with root package name */
        public final ComponentName f144a;
        public final long b;
        public final float c;

        public HistoricalRecord(ComponentName componentName, long j, float f) {
            this.f144a = componentName;
            this.b = j;
            this.c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || HistoricalRecord.class != obj.getClass()) {
                return false;
            }
            HistoricalRecord historicalRecord = (HistoricalRecord) obj;
            ComponentName componentName = historicalRecord.f144a;
            ComponentName componentName2 = this.f144a;
            if (componentName2 == null) {
                if (componentName != null) {
                    return false;
                }
            } else if (!componentName2.equals(componentName)) {
                return false;
            }
            return this.b == historicalRecord.b && Float.floatToIntBits(this.c) == Float.floatToIntBits(historicalRecord.c);
        }

        public final int hashCode() {
            ComponentName componentName = this.f144a;
            int iHashCode = componentName == null ? 0 : componentName.hashCode();
            long j = this.b;
            return Float.floatToIntBits(this.c) + ((((iHashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31);
        }

        public final String toString() {
            return "[; activity:" + this.f144a + "; time:" + this.b + "; weight:" + new BigDecimal(this.c) + "]";
        }
    }

    public interface OnChooseActivityListener {
    }

    public final class PersistHistoryAsyncTask extends AsyncTask<Object, Void, Void> {
        @Override // android.os.AsyncTask
        public final Void doInBackground(Object[] objArr) {
            throw null;
        }
    }

    public ActivityChooserModel(Context context, String str) {
        DefaultSorter defaultSorter = new DefaultSorter();
        new HashMap();
        this.f = defaultSorter;
        this.g = 50;
        this.h = true;
        this.i = true;
        this.d = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(".xml")) {
            this.e = str;
        } else {
            this.e = str.concat(".xml");
        }
    }

    public static ActivityChooserModel b(Context context, String str) {
        ActivityChooserModel activityChooserModel;
        synchronized (j) {
            try {
                HashMap map = k;
                activityChooserModel = (ActivityChooserModel) map.get(str);
                if (activityChooserModel == null) {
                    activityChooserModel = new ActivityChooserModel(context, str);
                    map.put(str, activityChooserModel);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return activityChooserModel;
    }

    public final void a() throws IOException {
        FileInputStream fileInputStreamOpenFileInput;
        XmlPullParser xmlPullParserNewPullParser;
        int next = 0;
        if (this.h && this.i) {
            String str = this.e;
            if (!TextUtils.isEmpty(str)) {
                this.h = false;
                try {
                    fileInputStreamOpenFileInput = this.d.openFileInput(str);
                } catch (FileNotFoundException | IOException unused) {
                }
                try {
                    try {
                        try {
                            xmlPullParserNewPullParser = Xml.newPullParser();
                            xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                            while (next != 1 && next != 2) {
                                next = xmlPullParserNewPullParser.next();
                            }
                        } catch (XmlPullParserException e) {
                            Log.e("ActivityChooserModel", "Error reading historical recrod file: " + str, e);
                            if (fileInputStreamOpenFileInput != null) {
                                fileInputStreamOpenFileInput.close();
                            }
                        }
                    } catch (IOException e2) {
                        Log.e("ActivityChooserModel", "Error reading historical recrod file: " + str, e2);
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                    }
                    if (!"historical-records".equals(xmlPullParserNewPullParser.getName())) {
                        throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                    }
                    ArrayList arrayList = this.c;
                    arrayList.clear();
                    while (true) {
                        int next2 = xmlPullParserNewPullParser.next();
                        if (next2 == 1) {
                            if (fileInputStreamOpenFileInput != null) {
                            }
                        } else if (next2 != 3 && next2 != 4) {
                            if (!"historical-record".equals(xmlPullParserNewPullParser.getName())) {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                            arrayList.add(new HistoricalRecord(ComponentName.unflattenFromString(xmlPullParserNewPullParser.getAttributeValue(null, "activity")), Long.parseLong(xmlPullParserNewPullParser.getAttributeValue(null, "time")), Float.parseFloat(xmlPullParserNewPullParser.getAttributeValue(null, "weight"))));
                        }
                    }
                    next = 1;
                } catch (Throwable th) {
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            }
        }
        ArrayList arrayList2 = this.c;
        int size = arrayList2.size() - this.g;
        if (size > 0) {
            this.i = true;
            for (int i = 0; i < size; i++) {
            }
        }
        if (next != 0) {
            notifyChanged();
        }
    }

    public final ResolveInfo c(int i) {
        synchronized (this.f143a) {
            a();
            throw null;
        }
    }

    public final int d() {
        int size;
        synchronized (this.f143a) {
            a();
            size = this.b.size();
        }
        return size;
    }

    public final ResolveInfo e() {
        synchronized (this.f143a) {
            try {
                a();
                if (!this.b.isEmpty()) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }
}

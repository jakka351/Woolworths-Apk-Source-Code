package androidx.core.content;

import YU.a;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.RequiresApi;
import androidx.core.util.ObjectsCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.medallia.digital.mobilesdk.q2;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {
    public static final String[] g = {"_display_name", "_size"};
    public static final File h = new File(q2.c);
    public static final HashMap i = new HashMap();
    public final Object d = new Object();
    public String e;
    public PathStrategy f;

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api21Impl {
        public static File[] a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* loaded from: classes2.dex */
    public interface PathStrategy {
        Uri a(File file);

        File b(Uri uri);
    }

    /* loaded from: classes2.dex */
    public static class SimplePathStrategy implements PathStrategy {

        /* renamed from: a, reason: collision with root package name */
        public final String f2414a;
        public final HashMap b = new HashMap();

        public SimplePathStrategy(String str) {
            this.f2414a = str;
        }

        @Override // androidx.core.content.FileProvider.PathStrategy
        public final Uri a(File file) throws IOException {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry entry2 : this.b.entrySet()) {
                    String path = ((File) entry2.getValue()).getPath();
                    if (FileProvider.a(canonicalPath).startsWith(FileProvider.a(path) + '/') && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException(a.A("Failed to find configured root that contains ", canonicalPath));
                }
                String path2 = ((File) entry.getValue()).getPath();
                return new Uri.Builder().scheme("content").authority(this.f2414a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith(q2.c) ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), q2.c)).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        @Override // androidx.core.content.FileProvider.PathStrategy
        public final File b(Uri uri) throws IOException {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            if (iIndexOf == -1) {
                throw new IllegalArgumentException(android.support.v4.media.session.a.m(uri, "Unable to find path from root: "));
            }
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = (File) this.b.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException(android.support.v4.media.session.a.m(uri, "Unable to find configured root for "));
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                String path = canonicalFile.getPath();
                String path2 = file.getPath();
                if (FileProvider.a(path).startsWith(FileProvider.a(path2) + '/')) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        public final void c(File file, String str) throws IOException {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.b.put(str, file.getCanonicalFile());
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
            }
        }
    }

    public static String a(String str) {
        return (str.length() <= 0 || str.charAt(str.length() - 1) != '/') ? str : androidx.compose.ui.input.pointer.a.h(1, 0, str);
    }

    public static PathStrategy c(Context context, String str) {
        PathStrategy pathStrategyE;
        HashMap map = i;
        synchronized (map) {
            try {
                pathStrategyE = (PathStrategy) map.get(str);
                if (pathStrategyE == null) {
                    try {
                        try {
                            pathStrategyE = e(context, str);
                            map.put(str, pathStrategyE);
                        } catch (XmlPullParserException e) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                        }
                    } catch (IOException e2) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return pathStrategyE;
    }

    public static Uri d(Context context, String str, File file) {
        return c(context, str).a(file);
    }

    public static SimplePathStrategy e(Context context, String str) throws XmlPullParserException, IOException {
        SimplePathStrategy simplePathStrategy = new SimplePathStrategy(str);
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (providerInfoResolveContentProvider == null) {
            throw new IllegalArgumentException(a.A("Couldn't find meta-data for provider with authority ", str));
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlResourceParserLoadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = xmlResourceParserLoadXmlMetaData.next();
            if (next == 1) {
                return simplePathStrategy;
            }
            if (next == 2) {
                String name = xmlResourceParserLoadXmlMetaData.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, AppMeasurementSdk.ConditionalUserProperty.NAME);
                String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, com.salesforce.marketingcloud.config.a.j);
                if ("root-path".equals(name)) {
                    externalStorageDirectory = h;
                } else if ("files-path".equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                    if (externalFilesDirs.length > 0) {
                        externalStorageDirectory = externalFilesDirs[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] externalCacheDirs = context.getExternalCacheDirs();
                    if (externalCacheDirs.length > 0) {
                        externalStorageDirectory = externalCacheDirs[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] fileArrA = Api21Impl.a(context);
                    if (fileArrA.length > 0) {
                        externalStorageDirectory = fileArrA[0];
                    }
                }
                if (externalStorageDirectory != null) {
                    String str2 = new String[]{attributeValue2}[0];
                    if (str2 != null) {
                        externalStorageDirectory = new File(externalStorageDirectory, str2);
                    }
                    simplePathStrategy.c(externalStorageDirectory, attributeValue);
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority;
        if (str == null || str.trim().isEmpty()) {
            throw new SecurityException("Provider must have a non-empty authority");
        }
        String str2 = providerInfo.authority.split(";")[0];
        synchronized (this.d) {
            this.e = str2;
        }
        HashMap map = i;
        synchronized (map) {
            map.remove(str2);
        }
    }

    public final PathStrategy b() {
        PathStrategy pathStrategy;
        synchronized (this.d) {
            try {
                ObjectsCompat.a(this.e, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                if (this.f == null) {
                    this.f = c(getContext(), this.e);
                }
                pathStrategy = this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pathStrategy;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return b().b(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File fileB = b().b(uri);
        int iLastIndexOf = fileB.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileB.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i2;
        File fileB = b().b(uri);
        if ("r".equals(str)) {
            i2 = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i2 = 738197504;
        } else if ("wa".equals(str)) {
            i2 = 704643072;
        } else if ("rw".equals(str)) {
            i2 = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                throw new IllegalArgumentException(a.A("Invalid mode: ", str));
            }
            i2 = 1006632960;
        }
        return ParcelFileDescriptor.open(fileB, i2);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i2;
        File fileB = b().b(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = g;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i3 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i3] = "_display_name";
                i2 = i3 + 1;
                objArr[i3] = queryParameter == null ? fileB.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i3] = "_size";
                i2 = i3 + 1;
                objArr[i3] = Long.valueOf(fileB.length());
            }
            i3 = i2;
        }
        String[] strArr4 = new String[i3];
        System.arraycopy(strArr3, 0, strArr4, 0, i3);
        Object[] objArr2 = new Object[i3];
        System.arraycopy(objArr, 0, objArr2, 0, i3);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}

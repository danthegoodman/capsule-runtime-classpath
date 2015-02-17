import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RuntimeClasspathCapsule extends Capsule {

    private static final String PROP_RUNTIME_CP = "caplet.runtime.classpath";
    private static final String LOG_PREFIX = "RUNTIME CP: ";

    public RuntimeClasspathCapsule(Capsule pred) {
        super(pred);
    }

    @Override
    protected List<Path> buildClassPath() {
        String cp = System.getProperty(PROP_RUNTIME_CP);
        if (cp == null || cp.isEmpty()) return super.buildClassPath();

        List<Path> paths = new ArrayList<>(super.buildClassPath());
        boolean doLog = isLogging(LOG_VERBOSE);

        String[] additions = cp.split(File.pathSeparator);
        if (isLogging(LOG_VERBOSE)) {
            System.err.println(LOG_PREFIX + "Appending to classpath: " + Arrays.toString(additions));
        }
        for (String p : additions) {
            paths.add(Paths.get(p));
        }
        return paths;
    }
}

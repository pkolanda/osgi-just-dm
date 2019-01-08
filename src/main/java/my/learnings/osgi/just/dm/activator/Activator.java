package my.learnings.osgi.just.dm.activator;

import org.apache.felix.dm.DependencyActivatorBase;
import org.apache.felix.dm.DependencyManager;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Activator extends DependencyActivatorBase{
    private static BundleContext context;
    private static Logger logger = LoggerFactory.getLogger("my.learnings.osgi.rest.jetty.activator");
    static BundleContext getContext() {
        return context;
    }

    public void start(BundleContext bundleContext) throws Exception {
        Activator.context = bundleContext;
        logger.info("Start called ");
        logger.info("getDependencyManager:{}", getDependencyManager());
    }

    public void stop(BundleContext bundleContext) throws Exception {
        Activator.context = null;

    }

    @Override
    public void init(BundleContext context, DependencyManager manager) throws Exception {
        logger.info("Init called");
    }

}
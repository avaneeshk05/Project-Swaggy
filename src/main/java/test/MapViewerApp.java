/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Avaneesh Koushik
 */
//import org.jxmapviewer.JXMapViewer;
//import org.jxmapviewer.OSMTileFactoryInfo;
//import org.jxmapviewer.viewer.DefaultTileFactory;
//import org.jxmapviewer.viewer.GeoPosition;
//import org.jxmapviewer.viewer.TileFactoryInfo;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class MapViewerApp {
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            // Create the main JFrame
//            JFrame frame = new JFrame("Map Viewer");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setSize(800, 600);
//            
//            // Create a JXMapViewer
//            JXMapViewer mapViewer = new JXMapViewer();
//            
//            // Set up the tile factory (OpenStreetMap)
//            TileFactoryInfo info = new OSMTileFactoryInfo();
//            DefaultTileFactory tileFactory = new DefaultTileFactory(info);
//            mapViewer.setTileFactory(tileFactory);
//            
//            // Set the initial zoom and center position
//            GeoPosition initialPosition = new GeoPosition(28.6139, 77.2090); // Delhi, India
//            mapViewer.setZoom(4);
//            mapViewer.setAddressLocation(initialPosition);
//            
//            // Add the map viewer to the frame
//            frame.add(mapViewer);
//            
//            // Display the frame
//            frame.setVisible(true);
//        });
//    }
//}


//-------------------------------------------------------------------

//import org.jxmapviewer.JXMapViewer;
//import org.jxmapviewer.OSMTileFactoryInfo;
//import org.jxmapviewer.input.PanMouseInputListener;
//import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;
//import org.jxmapviewer.viewer.DefaultTileFactory;
//import org.jxmapviewer.viewer.GeoPosition;
//import org.jxmapviewer.viewer.TileFactoryInfo;
//import org.jxmapviewer.viewer.Waypoint;
//import org.jxmapviewer.viewer.WaypointPainter;
//import org.jxmapviewer.viewer.DefaultWaypoint;
//
//import javax.swing.*;
//import javax.swing.event.MouseInputListener;
//import java.awt.*;
//import java.util.HashSet;
//import java.util.Set;
//
//public class MapViewerApp {
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            // Create the main JFrame
//            JFrame frame = new JFrame("Map Viewer");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setSize(800, 600);
//            
//            // Create a JXMapViewer
//            JXMapViewer mapViewer = new JXMapViewer();
//            
//            // Set up the tile factory (OpenStreetMap)
//            TileFactoryInfo info = new OSMTileFactoryInfo();
//            DefaultTileFactory tileFactory = new DefaultTileFactory(info);
//            mapViewer.setTileFactory(tileFactory);
//            
//            // Set the initial zoom and center position
//            GeoPosition initialPosition = new GeoPosition(28.6139, 77.2090); // Delhi, India
//            mapViewer.setZoom(4);
//            mapViewer.setAddressLocation(initialPosition);
//            
//            // Add Waypoints (Markers)
//            Set<Waypoint> waypoints = new HashSet<>();
//            waypoints.add(new DefaultWaypoint(new GeoPosition(28.7041, 77.1025))); // Marker for Delhi
//
//            WaypointPainter<Waypoint> waypointPainter = new WaypointPainter<>();
//            waypointPainter.setWaypoints(waypoints);
//            mapViewer.setOverlayPainter(waypointPainter);
//            
//            // Add Mouse Interaction
//            MouseInputListener mia = new PanMouseInputListener(mapViewer);
//            mapViewer.addMouseListener(mia);
//            mapViewer.addMouseMotionListener(mia);
//            mapViewer.addMouseWheelListener(new ZoomMouseWheelListenerCenter(mapViewer));
//            
//            // Customizing Map Appearance
//            mapViewer.setZoom(6);
//            mapViewer.setAddressLocation(new GeoPosition(12.9716, 77.5946)); // Center on Bangalore, India
//            
//            // Add the map viewer to the frame
//            frame.add(mapViewer);
//            
//            // Display the frame
//            frame.setVisible(true);
//        });
//    }
//}


//----------------------version3--------------------------------

import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.jxmapviewer.viewer.Waypoint;
import org.jxmapviewer.viewer.WaypointPainter;
import org.jxmapviewer.painter.CompoundPainter;
import org.jxmapviewer.painter.Painter;
import org.jxmapviewer.viewer.DefaultWaypoint;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class MapViewerApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                // Addresses for start and end points
                String startAddress = "Connaught Place, New Delhi, India";
                String endAddress = "India Gate, New Delhi, India";

                // Get coordinates from addresses
                GeoPosition startPosition = NominatimGeocodeHelper.getCoordinates(startAddress);
                GeoPosition endPosition = NominatimGeocodeHelper.getCoordinates(endAddress);

                // Create the main JFrame
                JFrame frame = new JFrame("Map Viewer");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(800, 600);

                // Create a JXMapViewer
                JXMapViewer mapViewer = new JXMapViewer();

                // Set up the tile factory (OpenStreetMap)
                TileFactoryInfo info = new OSMTileFactoryInfo();
                DefaultTileFactory tileFactory = new DefaultTileFactory(info);
                mapViewer.setTileFactory(tileFactory);

                // Set the initial zoom and center position
                mapViewer.setZoom(4);
                mapViewer.setAddressLocation(startPosition);

                // Add Waypoints (Markers)
                Set<Waypoint> waypoints = new HashSet<>();
                waypoints.add(new DefaultWaypoint(startPosition));
                waypoints.add(new DefaultWaypoint(endPosition));

                WaypointPainter<Waypoint> waypointPainter = new WaypointPainter<>();
                waypointPainter.setWaypoints(waypoints);

                // Add Route
                List<GeoPosition> route = new ArrayList<>();
                route.add(startPosition);
                route.add(endPosition);

                RoutePainter routePainter = new RoutePainter(route);

                // Combine painters
                List<Painter<JXMapViewer>> painters = new ArrayList<>();
                painters.add(waypointPainter);
                painters.add(routePainter);

                mapViewer.setOverlayPainter(new CompoundPainter<>(painters));

                // Add Mouse Interaction
                MouseInputListener mia = new PanMouseInputListener(mapViewer);
                mapViewer.addMouseListener(mia);
                mapViewer.addMouseMotionListener(mia);
                mapViewer.addMouseWheelListener(new ZoomMouseWheelListenerCenter(mapViewer));

                // Add the map viewer to the frame
                frame.add(mapViewer);

                // Display the frame
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}

/**
 * Created by kiker on 03.11.16.
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.PointLight;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        // PhongMaterial
        PhongMaterial material = new PhongMaterial();
        material.setDiffuseColor(Color.WHITE);

        // Create a Box
        Box box = new Box(100, 100, 100);
        box.setTranslateX(150);
        box.setTranslateY(0);
        box.setTranslateZ(400);
//        box.setMaterial(material);

        // Create a Sphere
        Sphere sphere = new Sphere(50);
        sphere.setTranslateX(300);
        sphere.setTranslateY(-5);
        sphere.setTranslateZ(400);

        // Create a cylinder
        Cylinder cylinder = new Cylinder(40, 120);
        cylinder.setTranslateX(500);
        cylinder.setTranslateY(-25);
        cylinder.setTranslateZ(600);

        // Create a light
        PointLight light = new PointLight();
        light.setTranslateX(300);
        light.setTranslateY(100);
        light.setTranslateZ(400);

        // Add shapes and a light to the group
        Group root = new Group(box, sphere, cylinder, light);

        // Craete a Scene with depth buffer enabled
        Scene scene = new Scene(root, 300, 100, true);

        // Set a camera to view the 3D shapes
        PerspectiveCamera camera = new PerspectiveCamera(false);
        camera.setTranslateX(100);
        camera.setTranslateY(-50);
        camera.setTranslateZ(300);
        scene.setCamera(camera);

        stage.setScene(scene);
        stage.setTitle("Using 3D Shapes: Box, Sphere and Cylinder");
        stage.show();
    }
}

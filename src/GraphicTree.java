import java.awt.Graphics;

import javax.swing.JPanel;
import java.awt.Point;

public class GraphicTree extends JPanel{
    Tree t;
    int w, h;
    int boxHeight;
    int treeHeight;

    GraphicTree(Tree t, int width, int height){
        this.t = t;
        this.setBounds(0, 0, width, height);
        w = width;
        h = height;
        treeHeight = t.height();
        boxHeight = height / treeHeight;
    }

    @Override
    public void paint(Graphics g) {
        drawNode(g, t.getRoot(), null, 20, 20);
        //super.paint(g);
    }

    private void drawNode(Graphics g, TreeNode t, Point father, int nodeWidth, int nodeHeight){
        if(t == null) return;
        int y = t.getI() * boxHeight;
        int boxWidth = (int)(w / Math.pow(2, t.getI()));
        int x = t.getJ() * boxWidth;
        y = y + boxHeight / 2;
        x = x + boxWidth / 2;
        g.drawOval(x, y, nodeWidth, nodeHeight);
        g.drawString(t.toString(), x + nodeWidth / 2, (int) (y + nodeHeight / 1.5));

        Point child = new Point(x + nodeWidth / 2, y);
        if(father != null){
            g.drawLine(father.x, father.y, child.x, child.y);
        }
        
        child.y += nodeHeight;

        drawNode(g, t.getLeft(), child, nodeWidth, nodeHeight);
        drawNode(g, t.getRight(), child, nodeWidth, nodeHeight);
    }
}

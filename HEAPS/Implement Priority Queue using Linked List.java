/* class QueueNode
{
  int data;
  int priority;
  QueueNode next;
  public QueueNode(int data, int p) 
  {
    this.data = data;
    this.priority = p;
  }
} is provided to you. */ 

class PQueueLL
{
  public QueueNode front, rear;
    public PQueueLL() {
        this.front = this.rear = null;
    }
  public void EnQueue(int data, int priority) {
        QueueNode newNode = new QueueNode(data, priority);
        
        // If the queue is empty, add the first element
        if (front == null) {
            front = rear = newNode;
        } else {
            // Insert in the correct position according to priority
            if (front.priority > priority) {
                newNode.next = front;
                front = newNode;
            } else {
                QueueNode current = front;
                while (current.next != null && current.next.priority <= priority) {
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    // Dequeue operation
    public int DeQueue() {
        if (front == null) {
            System.out.println("-1");
            return -1; // If the queue is empty
        }

        // Remove the front element
        int value = front.data;
        front = front.next;

        return value;
    }
}

